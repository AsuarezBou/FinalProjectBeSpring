package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.DocumentosDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.DocumentosEntity;

public interface DocumentosMapper {

	DocumentosDTO toDto(DocumentosEntity e);
}
