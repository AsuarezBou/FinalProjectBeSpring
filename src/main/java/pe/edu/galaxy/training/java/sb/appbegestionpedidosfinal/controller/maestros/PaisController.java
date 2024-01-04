package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.controller.maestros;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.PaisDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros.PaisService;

@RestController
@RequestMapping("api/v1/paises")
public class PaisController {
	
	private final PaisService paisService;

	public PaisController(final PaisService paisService) {
		super();
		this.paisService = paisService;
	}

	@GetMapping
	public ResponseEntity<?> findAll() throws ServiceException {
		try {
			
			List<PaisDTO> paises = paisService.findAll();
			
			if(paises.isEmpty()) {
				
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.ok(paises);
			
		}catch(Exception e) {
			
			return ResponseEntity.internalServerError().body(null);
		}
	}
	
	@GetMapping("by-page")
	public ResponseEntity<?> findByPage(
			@RequestParam(name = "pageNumber", defaultValue = "1") int pageNumber,
			@RequestParam(name = "pageSize" , defaultValue = "1") int pageSize) throws ServiceException {
		try {
			
			PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);
			Page<PaisDTO> paises = paisService.findByLikePage(pageRequest);
			
			if(paises.isEmpty()) {
				
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.ok(paises);
			
		}catch(Exception e) {
			
			return ResponseEntity.internalServerError().body(null);
		}
	}

}
