package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.controller.maestros;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.GeneroDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros.GeneroService;

@RestController
@RequestMapping("api/v1/generos")
public class GeneroController {
	
	private final GeneroService generoService;

	public GeneroController(GeneroService generoService) {
		super();
		this.generoService = generoService;
	}
	
	@GetMapping
	public ResponseEntity<?> findAll() throws ServiceException{
		
		try {
			
			List<GeneroDTO> generos = generoService.findAll();
			
			if(generos.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.ok(generos);
			
		}catch(Exception e) {
			return ResponseEntity.internalServerError().body(null);
		}
		 
	}

}
