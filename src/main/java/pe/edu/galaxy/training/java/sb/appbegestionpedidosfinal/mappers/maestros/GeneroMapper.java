package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.GeneroDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.GeneroEntity;

public interface GeneroMapper  {
	GeneroDTO toDto(GeneroEntity e);

}
