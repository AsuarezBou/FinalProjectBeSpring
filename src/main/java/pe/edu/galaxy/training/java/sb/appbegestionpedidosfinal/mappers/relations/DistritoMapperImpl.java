package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.DistritoDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.DistritoEntity;

@Component
public class DistritoMapperImpl implements DistritoMapper{
	
	private final CiudadMapper ciudadMapper;
	

	public DistritoMapperImpl(CiudadMapper ciudadMapper) {
		super();
		this.ciudadMapper = ciudadMapper;
	}


	@Override
	public DistritoDTO toDto(DistritoEntity e) {
		
		return DistritoDTO
				.builder()
				.id(e.getId())
				.nombre(e.getNombre())
				.ciudad(ciudadMapper.toDto(e.getCiudad()))
				.build();
	}

}
