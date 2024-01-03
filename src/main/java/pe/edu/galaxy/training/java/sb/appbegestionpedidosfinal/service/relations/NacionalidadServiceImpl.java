package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.relations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations.NacionalidadDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.relations.NacionalidadMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.relations.NacionalidadRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;

@Service
public class NacionalidadServiceImpl implements NacionalidadService{
	
	private final NacionalidadRepository nacionalidadRepository;
	private final NacionalidadMapper nacionalidadMapper;
	
	
	

	public NacionalidadServiceImpl(NacionalidadRepository nacionalidadRepository,
			NacionalidadMapper nacionalidadMapper) {
		super();
		this.nacionalidadRepository = nacionalidadRepository;
		this.nacionalidadMapper = nacionalidadMapper;
	}

	@Override
	public List<NacionalidadDTO> findAll() throws ServiceException {

		try {
			
			return nacionalidadRepository.findAll().stream().map(p -> nacionalidadMapper.toDto(p)).toList();
			
		}catch(Exception e){
			throw new ServiceException(e);
		}
	}

	@Override
	public List<NacionalidadDTO> findByLikeObject(NacionalidadDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NacionalidadDTO save(NacionalidadDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NacionalidadDTO update(NacionalidadDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<NacionalidadDTO> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
