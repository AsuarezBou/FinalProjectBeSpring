package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.GeneroDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.GeneroEntity;

@Component
public class GeneroMapperImpl implements GeneroMapper{

	@Override
	public GeneroDTO toDto(GeneroEntity e) {
		return GeneroDTO
				.builder()
				.id(e.getId())
				.descripcion(e.getDescripcion())
				.build();
	}

}
