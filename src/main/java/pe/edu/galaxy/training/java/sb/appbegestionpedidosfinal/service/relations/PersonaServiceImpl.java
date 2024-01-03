package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.relations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.PersonaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations.PersonaMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.relations.PersonaRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	private final PersonaRepository personaRepository;
	private final PersonaMapper personaMapper;
	
	

	public PersonaServiceImpl(PersonaRepository personaRepository, PersonaMapper personaMapper) {
		super();
		this.personaRepository = personaRepository;
		this.personaMapper = personaMapper;
	}

	@Override
	public List<PersonaDTO> findAll() throws ServiceException {
		
		try {
			
			return personaRepository.findAll().stream().map(p -> personaMapper.toDto(p)).toList();
			
		}catch(Exception e) {
			throw new ServiceException(e);
		}
		
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

}
