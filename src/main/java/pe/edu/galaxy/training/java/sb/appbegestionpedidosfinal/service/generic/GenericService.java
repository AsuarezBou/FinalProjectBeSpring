package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.generic;

import java.util.List;
import java.util.Optional;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;

public interface GenericService<T> {
	List<T> findAll() throws ServiceException;
	
	List<T> findByLikeObject(T t) throws ServiceException;

	T save(T t) throws ServiceException;

	T update(T t) throws ServiceException;

	void delete(Long id) throws ServiceException;

	Optional<T> findById(Long id) throws ServiceException;
}
