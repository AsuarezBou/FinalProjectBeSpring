package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.CiudadDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.CiudadEntity;

public interface CiudadMapper {
	
	CiudadDTO toDto(CiudadEntity e);

}
