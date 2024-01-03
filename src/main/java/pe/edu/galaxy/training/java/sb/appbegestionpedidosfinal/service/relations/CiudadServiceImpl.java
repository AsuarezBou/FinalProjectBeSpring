package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.relations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.CiudadDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations.CiudadMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.relations.CiudadRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;

@Service
public class CiudadServiceImpl implements CiudadService{
	
	private final CiudadRepository ciudadRepository;
	private final CiudadMapper ciudadMapper;
	
	

	public CiudadServiceImpl(CiudadRepository ciudadRepository, CiudadMapper ciudadMapper) {
		super();
		this.ciudadRepository = ciudadRepository;
		this.ciudadMapper = ciudadMapper;
	}

	@Override
	public List<CiudadDTO> findAll() throws ServiceException {
		
		try {
			
			return ciudadRepository.findAll().stream().map(p -> ciudadMapper.toDto(p)).toList();
			
		}catch(Exception e){
			throw new ServiceException(e);
		}
	}

	@Override
	public List<CiudadDTO> findByLikeObject(CiudadDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CiudadDTO save(CiudadDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CiudadDTO update(CiudadDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<CiudadDTO> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
