package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.PersonaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.PersonaEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros.DocumentosMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros.GeneroMapper;

@Component
public class PersonaMapperImpl implements PersonaMapper{
	
	private final DistritoMapper distritoMapper;
	private final DocumentosMapper documentosMapper;
	private final GeneroMapper generoMapper;
	private final NacionalidadMapper nacionalidadMapper;
	
	

	public PersonaMapperImpl(DistritoMapper distritoMapper, DocumentosMapper documentosMapper,
			GeneroMapper generoMapper, NacionalidadMapper nacionalidadMapper) {
		super();
		this.distritoMapper = distritoMapper;
		this.documentosMapper = documentosMapper;
		this.generoMapper = generoMapper;
		this.nacionalidadMapper = nacionalidadMapper;
	}

	@Override
	public PersonaDTO toDto(PersonaEntity e) {
		
		return PersonaDTO
				.builder()
				.apellidoMaterno(e.getApellidoMaterno())
				.apellidoPaterno(e.getApellidoPaterno())
				.direccion(e.getDireccion())
				.numeroDocumento(e.getNumeroDocumento())
				.fechaNacimiento(e.getFechaNacimiento())
				.id(e.getId())
				.nombres(e.getNombres())
				.distrito(distritoMapper.toDto(e.getDistrito()))
				.documento(documentosMapper.toDto(e.getDocumento()))
				.genero(generoMapper.toDto(e.getGenero()))
				.nacionalidadDTO(nacionalidadMapper.toDto(e.getNacionalidad()))
				.build();
		
	}

}
