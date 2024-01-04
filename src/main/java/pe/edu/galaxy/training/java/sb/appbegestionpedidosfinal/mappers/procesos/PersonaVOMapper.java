package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.procesos;

import java.util.List;

import org.mapstruct.Mapper;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos.PersonaVODTOResponse;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.vo.PersonaVOEntity;

@Mapper(componentModel = "spring")
public interface PersonaVOMapper {
	
	List<PersonaVODTOResponse> toLstPersonaVODTOResponse(List<PersonaVOEntity> lstPersonaEntity);

}
