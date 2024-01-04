package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.relations;

import java.util.List;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos.PersonaRegistroRequest;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos.PersonaVODTOResponse;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.PersonaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.generic.GenericService;

public interface PersonaService extends GenericService<PersonaDTO>{
	
	Long save(PersonaRegistroRequest personaRegistroRequest) throws ServiceException;
	
	List<PersonaVODTOResponse> findByLikeDocumentNumber(String numeroDocumento) throws ServiceException;

}
