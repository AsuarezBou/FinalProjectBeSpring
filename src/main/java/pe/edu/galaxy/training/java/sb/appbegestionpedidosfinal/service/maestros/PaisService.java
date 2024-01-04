package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.PaisDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.generic.GenericService;

public interface PaisService extends GenericService<PaisDTO> {

	Page<PaisDTO> findByLikePage(Pageable page, String nombre) throws ServiceException;
}
