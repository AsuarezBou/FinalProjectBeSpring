package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.controller.relations;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.NacionalidadDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.relations.NacionalidadService;

@RestController
@RequestMapping("api/v1/nacionalidades")
public class NacionalidadController {
	
	private final NacionalidadService nacionalidadService;

	public NacionalidadController(NacionalidadService nacionalidadService) {
		super();
		this.nacionalidadService = nacionalidadService;
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() throws ServiceException{
		try {
			
			List<NacionalidadDTO> nacionalidades = nacionalidadService.findAll();
			
			if(nacionalidades.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.ok(nacionalidades);
			
		}catch(Exception e) {
			return ResponseEntity.internalServerError().body(null);
		}
	}

}
