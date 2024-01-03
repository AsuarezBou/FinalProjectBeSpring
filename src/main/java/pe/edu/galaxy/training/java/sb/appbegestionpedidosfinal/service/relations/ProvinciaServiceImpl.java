package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.relations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.ProvinciaDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations.ProvinciaMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.relations.ProvinciaRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;

@Service
public class ProvinciaServiceImpl implements ProvinciaService{
	
	private final ProvinciaRepository provinciaRepository;
	private final ProvinciaMapper provinciaMapper;
	
	

	public ProvinciaServiceImpl(ProvinciaRepository provinciaRepository, ProvinciaMapper provinciaMapper) {
		super();
		this.provinciaRepository = provinciaRepository;
		this.provinciaMapper = provinciaMapper;
	}

	@Override
	public List<ProvinciaDTO> findAll() throws ServiceException {
		
		try {
			
			return provinciaRepository.findAll().stream().map(p -> provinciaMapper.toDto(p)).toList();
			
		}catch(Exception e) {
			
			throw new ServiceException(e);
		}
		
	}

	@Override
	public List<ProvinciaDTO> findByLikeObject(ProvinciaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProvinciaDTO save(ProvinciaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProvinciaDTO update(ProvinciaDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ProvinciaDTO> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
