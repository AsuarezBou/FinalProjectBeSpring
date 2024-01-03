package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.CiudadDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.CiudadEntity;

@Component
public class CiudadMapperImpl implements CiudadMapper {
	
	private final ProvinciaMapper provinciaMapper;
	
	

	public CiudadMapperImpl(ProvinciaMapper provinciaMapper) {
		super();
		this.provinciaMapper = provinciaMapper;
	}



	@Override
	public CiudadDTO toDto(CiudadEntity e) {
		
		return CiudadDTO.builder()
				.id(e.getId())
				.nombre(e.getNombre())
				.provincia(provinciaMapper.toDto(e.getProvincia()))
				.build();
	}

}
