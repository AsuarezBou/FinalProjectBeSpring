package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.PaisDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.PaisEntity;

public interface PaisMapper {
	PaisDTO toDto(PaisEntity e);
}
