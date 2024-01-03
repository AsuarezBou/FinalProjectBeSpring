package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros;

import java.util.Optional;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.ClienteDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.ClienteEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.generic.GenericService;


public interface ClienteService extends GenericService<ClienteDTO> {
	
	Optional<ClienteEntity> findByDocument(String document)  throws ServiceException;

}
