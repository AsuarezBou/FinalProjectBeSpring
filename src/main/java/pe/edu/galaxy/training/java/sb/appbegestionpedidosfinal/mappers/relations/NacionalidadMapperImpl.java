package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.NacionalidadDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.NacionalidadEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros.PaisMapper;

@Component
public class NacionalidadMapperImpl implements NacionalidadMapper {
	
	private PaisMapper paisMapper;
	
	

	public NacionalidadMapperImpl(PaisMapper paisMapper) {
		super();
		this.paisMapper = paisMapper;
	}


	@Override
	public NacionalidadDTO toDto(NacionalidadEntity e) {
		
		return NacionalidadDTO
						.builder()
						.id(e.getId())
						.pais(paisMapper.toDto(e.getPais()))
						.descripcion(e.getDescripcion())
						.build();
	}

}
