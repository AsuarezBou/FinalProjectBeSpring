package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception;

import org.springframework.validation.BindingResult;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@EqualsAndHashCode(callSuper=false)
public class ServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private BindingResult resultErrors;
	
	public ServiceException(BindingResult resultErrors) {
		this.resultErrors=resultErrors;
	}


	public ServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

	public ServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}


}
