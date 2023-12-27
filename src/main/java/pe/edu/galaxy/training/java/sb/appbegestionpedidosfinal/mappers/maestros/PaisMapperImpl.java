package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.PaisDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.PaisEntity;

@Component
public class PaisMapperImpl implements PaisMapper {

	@Override
	public PaisDTO toDto(PaisEntity e) {
		return PaisDTO
				.builder()
				.id(e.getId())
				.descripcion(e.getDescripcion())
				.build();
	}

}
