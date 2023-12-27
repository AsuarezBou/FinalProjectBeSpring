package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.NacionalidadDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.NacionalidadEntity;

@Component
public class NacionalidadMapperImpl implements NacionalidadMapper {

	@Override
	public NacionalidadDTO toDto(NacionalidadEntity e) {
		
		return NacionalidadDTO
						.builder()
						.id(e.getId())
						.pais(e.getPais())
						.descripcion(e.getDescripcion())
						.build();
	}

}
