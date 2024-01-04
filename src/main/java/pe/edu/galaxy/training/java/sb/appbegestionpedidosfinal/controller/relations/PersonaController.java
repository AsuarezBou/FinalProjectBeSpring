package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.controller.relations;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.commons.GenericResponse;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos.PersonaRegistroRequest;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos.PersonaVODTOResponse;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.PersonaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.relations.PersonaService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/personas")
public class PersonaController {
	
	private final PersonaService personaService;

	@GetMapping
	public ResponseEntity<?> findAll() throws ServiceException{
		
		try {
			
			List<PersonaDTO> personas = personaService.findAll();
			
			if(personas.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.ok(personas);
			
		} catch(Exception e) {
			return ResponseEntity.internalServerError().body(null);
		}
	}
	
	@GetMapping("/by-document")
	public ResponseEntity<?> findByLikeDocumentNumber
					(@RequestParam(value = "numeroDocumento" ,defaultValue = "") String numeroDocumento) throws ServiceException{
		
		try {
			log.info("numeroDocumento {}",numeroDocumento);
			List<PersonaVODTOResponse> lstPersonasVOResponse = personaService.findByLikeDocumentNumber(numeroDocumento);
			
			if(lstPersonasVOResponse.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.ok(lstPersonasVOResponse);
			
		} catch(Exception e) {
			return ResponseEntity.internalServerError().body(null);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> save(@Valid @RequestBody PersonaRegistroRequest personaRegistroRequest, BindingResult result) throws ServiceException{
		
		if(result.hasErrors()) {
			throw new ServiceException(result);
		}
		
		Long id = personaService.save(personaRegistroRequest);
		
		return new ResponseEntity<>(GenericResponse.builder().code(1).message("operación exitosa").content(id).build(), HttpStatus.CREATED);
	}

}
