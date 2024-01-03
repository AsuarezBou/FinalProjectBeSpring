package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.PersonaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.PersonaEntity;

public interface PersonaMapper {
	
	PersonaDTO toDto(PersonaEntity e);

}
