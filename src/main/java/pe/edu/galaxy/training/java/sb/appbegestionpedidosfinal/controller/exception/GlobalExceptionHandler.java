package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.controller.exception;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.util.WebUtils;
import static java.util.Objects.isNull;
import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler({ ServiceException.class})
    public final ResponseEntity<?> handleException(Exception ex, WebRequest request) {
        HttpHeaders headers = new HttpHeaders();

        if (ex instanceof ServiceException) {
        	log.info("ServiceExecption...");
            HttpStatus status = HttpStatus.BAD_REQUEST;
            ServiceException se = (ServiceException) ex;

            return handleServiceBadRequestException(se, headers, status, request);
        } else {
            HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
            return handleExceptionInternal(ex, null, headers, status, request);
        }
    }
	
	//Handlers
    protected ResponseEntity<?> handleServiceBadRequestException(ServiceException se, HttpHeaders headers, 
    		HttpStatus status, WebRequest request) {
        
		if (!isNull(se.getResultErrors())) {

			List<Map<String, String>> fErrors = se.getResultErrors().getFieldErrors().stream().map(err -> {
				Map<String, String> error = new HashMap<>();
				error.put(err.getField(), err.getDefaultMessage());
				return error;
			}).toList();
			;

			return handleExceptionInternal(se, fErrors, headers, status, request);

		} else {
    	
	    	List<String> errors = Collections.singletonList(se.getMessage());
	        log.info("errors... "+errors);
	        Map<String,Object> body = new HashMap<>();
	        body.put("erros", errors);
	        return handleExceptionInternal(se,body, headers, status, request);
        }
    	
        
        
    }
    
    protected ResponseEntity<?> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, 
    		HttpStatus status, WebRequest request) {
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, ex, WebRequest.SCOPE_REQUEST);
        }

        return new ResponseEntity<>(body, headers, status);
    }

}
