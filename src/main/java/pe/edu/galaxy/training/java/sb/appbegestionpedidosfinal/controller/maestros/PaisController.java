package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.controller.maestros;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public List<PaisDTO> findAll() throws ServiceException {
		return paisService.findAll();
	}

}
