package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.NacionalidadDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.NacionalidadEntity;

public interface NacionalidadMapper {
	
	NacionalidadDTO toDto(NacionalidadEntity e);
}
