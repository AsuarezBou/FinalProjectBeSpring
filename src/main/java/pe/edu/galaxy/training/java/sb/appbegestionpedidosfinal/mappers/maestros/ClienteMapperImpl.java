package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import org.springframework.stereotype.Component;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.ClienteDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.ClienteEntity;


@Component
public class ClienteMapperImpl implements ClienteMapper{
	@Override
	public ClienteDTO toDto(ClienteEntity e) {
		
		return ClienteDTO
				.builder()
				.id(e.getId())
				.ruc((e.getRuc()==null)?"":e.getRuc())
				.razonSocial(e.getRazonSocial().toUpperCase())
				.build();
	}
}
