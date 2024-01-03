package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.GeneroDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros.GeneroMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.maestros.GeneroRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;


@Service
public class GeneroServiceImpl implements GeneroService{
	
	private final GeneroRepository generoRepository;
	private final GeneroMapper generoMapper;
	
	

	public GeneroServiceImpl(GeneroRepository generoRepository, GeneroMapper generoMapper) {
		super();
		this.generoRepository = generoRepository;
		this.generoMapper = generoMapper;
	}

	@Override
	public List<GeneroDTO> findAll() throws ServiceException {

		try{
			
			return generoRepository.findAll().stream().map(p -> generoMapper.toDto(p)).toList();
			
		}catch(Exception e){
			throw new ServiceException(e);
		}
	}

	@Override
	public List<GeneroDTO> findByLikeObject(GeneroDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneroDTO save(GeneroDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneroDTO update(GeneroDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<GeneroDTO> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
