package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.controller.relations;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.PersonaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros.PersonaService;

@RestController
@RequestMapping("api/v1/personas")
public class PersonaController {
	
	private final PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		super();
		this.personaService = personaService;
	}
	
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

}
