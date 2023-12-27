package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.ClienteDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.ClienteEntity;

public interface ClienteMapper {
	ClienteDTO toDto(ClienteEntity e);

}
