package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.ClienteDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.ClienteEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros.ClienteMapper;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.maestros.ClienteRepository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;


@Service
public class ClienteServiceImpl implements ClienteService  {
	
	private final ClienteRepository clienteRepository;
	
	private final ClienteMapper clienteMapper;
	
	public ClienteServiceImpl(final ClienteRepository clienteRepository,final ClienteMapper clienteMapper) {

		this.clienteRepository = clienteRepository;
		this.clienteMapper=clienteMapper;

	}

	@Override
	public List<ClienteDTO> findAll() throws ServiceException {
		try {
			
			return clienteRepository.findAll().stream().map(p -> clienteMapper.toDto(p)).toList();
			
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public List<ClienteDTO> findByLikeObject(ClienteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDTO save(ClienteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDTO update(ClienteDTO t) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ClienteDTO> findById(Long id) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<ClienteEntity> findByDocument(String document) throws ServiceException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
