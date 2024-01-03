package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.ProvinciaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.ProvinciaEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros.PaisMapper;

@Component
public class ProvinciaMapperImpl implements ProvinciaMapper{
	
	private final PaisMapper paisMapper;
	

	public ProvinciaMapperImpl(PaisMapper paisMapper) {
		super();
		this.paisMapper = paisMapper;
	}


	@Override
	public ProvinciaDTO toDto(ProvinciaEntity e) {
		
		return ProvinciaDTO
				.builder()
				.id(e.getId())
				.nombre(e.getNombre())
				.pais(paisMapper.toDto(e.getPais()))
				.build();
	}

}
