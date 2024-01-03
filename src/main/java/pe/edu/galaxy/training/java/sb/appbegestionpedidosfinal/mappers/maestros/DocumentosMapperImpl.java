package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.DocumentosDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.DocumentosEntity;

@Component
public class DocumentosMapperImpl implements DocumentosMapper{

	@Override
	public DocumentosDTO toDto(DocumentosEntity e) {
		
		return DocumentosDTO
				.builder()
				.id(e.getId())
				.descripcion(e.getDescripcion())
				.build();
	}

}
