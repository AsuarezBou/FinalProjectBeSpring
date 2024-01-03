package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.PaisDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros.PaisMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.maestros.PaisRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;

@Service
public class PaisServiceImpl implements PaisService{
	
	private final PaisRepository paisRepository;
	private final PaisMapper paisMapper;

	
	public PaisServiceImpl(final PaisRepository paisRepository,final PaisMapper paisMapper) {

		this.paisRepository = paisRepository;
		this.paisMapper=paisMapper;

	}
	@Override
	public List<PaisDTO> findAll() throws ServiceException {
		try {
			
			return paisRepository.findAll().stream().map(p -> paisMapper.toDto(p)).toList();

		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public List<PaisDTO> findByLikeObject(PaisDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaisDTO save(PaisDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaisDTO update(PaisDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PaisDTO> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
