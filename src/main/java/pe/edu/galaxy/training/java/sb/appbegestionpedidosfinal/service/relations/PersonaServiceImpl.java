package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.relations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos.PersonaRegistroRequest;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos.PersonaVODTOResponse;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.PersonaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.GeneroEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.DistritoEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.NacionalidadEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.PersonaEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.procesos.PersonaVOMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations.PersonaMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.maestros.DocumentosRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.maestros.GeneroRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.procesos.PersonaRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.procesos.PersonaVORepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.relations.DistritoRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.relations.NacionalidadRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.DocumentosEntity;

import static java.util.Objects.isNull;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonaServiceImpl implements PersonaService {
	
	private final PersonaRepository personaRepository;
	private final NacionalidadRepository nacionalidadRepository;
	private final GeneroRepository generoRepository;
	private final DocumentosRepository documentosRepository;
	private final DistritoRepository distritoRepository;
	private final PersonaMapper personaMapper;
	private final PersonaVORepository personaVORepository;
	private final PersonaVOMapper personaVOMapper;
	

	@Override
	public List<PersonaDTO> findAll() throws ServiceException {
		
		try {
			
			return personaRepository.findAll().stream().map(p -> personaMapper.toDto(p)).toList();
			
		}catch(Exception e) {
			throw new ServiceException(e);
		}
		
	}
	
	@Transactional
	@Override
	public Long save(PersonaRegistroRequest personaRegistroRequest) throws ServiceException{
		
		log.info(personaRegistroRequest.toString());
		
		PersonaEntity personaEntityRequest = new PersonaEntity();
				
		Optional<NacionalidadEntity> optNacionalidadEntity = nacionalidadRepository.findById(personaRegistroRequest.getNacionalidad());
		if (isNull(optNacionalidadEntity) || !optNacionalidadEntity.isPresent()) {
			throw new ServiceException( String.format("La nacionalidad con el id %s no existe", personaRegistroRequest.getNacionalidad()));
		}
		
		Optional<GeneroEntity> optGenerodEntity = generoRepository.findById(personaRegistroRequest.getGenero());
		if (isNull(optGenerodEntity) || !optGenerodEntity.isPresent()) {
			throw new ServiceException( String.format("El genero con el id %s no existe", personaRegistroRequest.getGenero()));
		}
		
		Optional<DocumentosEntity> optDocumentosdEntity = documentosRepository.findById(personaRegistroRequest.getTipoDocumento());
		if (isNull(optDocumentosdEntity) || !optDocumentosdEntity.isPresent()) {
			throw new ServiceException( String.format("El tipo de documento con el id %s no existe", personaRegistroRequest.getTipoDocumento()));
		}
		
		Optional<DistritoEntity> optDistritodEntity = distritoRepository.findById(personaRegistroRequest.getDistrito());
		if (isNull(optDistritodEntity) || !optDistritodEntity.isPresent()) {
			throw new ServiceException( String.format("El distrito con el id %s no existe", personaRegistroRequest.getDistrito()));
		}
		
		PersonaEntity personaEntity = personaRepository.findByDocumentNumber(personaRegistroRequest.getNumeroDocumento());
		if(!isNull(personaEntity)) {
			throw new ServiceException(String.format("La persona con el documento %s ya existe", personaRegistroRequest.getNumeroDocumento()));
		}
				
		personaEntityRequest.setApellidoMaterno(personaRegistroRequest.getApellidoMaterno());
		personaEntityRequest.setApellidoPaterno(personaRegistroRequest.getApellidoPaterno());
		personaEntityRequest.setDireccion(personaRegistroRequest.getDireccion());
		personaEntityRequest.setDistrito(new DistritoEntity(personaRegistroRequest.getDistrito()));
		personaEntityRequest.setDocumento(new DocumentosEntity(personaRegistroRequest.getTipoDocumento()));
		personaEntityRequest.setFechaNacimiento(personaRegistroRequest.getFechaNacimiento());
		personaEntityRequest.setGenero(new GeneroEntity(personaRegistroRequest.getGenero()));
		personaEntityRequest.setNacionalidad(new NacionalidadEntity(personaRegistroRequest.getNacionalidad()));
		personaEntityRequest.setNombres(personaRegistroRequest.getNombres());
		personaEntityRequest.setNumeroDocumento(personaRegistroRequest.getNumeroDocumento());
		
		personaRepository.save(personaEntityRequest);
				
		
		return personaEntityRequest.getId();
	}

	@Override
	public List<PersonaDTO> findByLikeObject(PersonaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonaDTO save(PersonaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonaDTO update(PersonaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PersonaDTO> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<PersonaVODTOResponse> findByLikeDocumentNumber(String numeroDocumento) throws ServiceException {
		
		return personaVOMapper.toLstPersonaVODTOResponse(personaVORepository.findByLikeDocumentNumber("%"+numeroDocumento+"%"));
	}

}
