package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.mappers.maestros;

import java.util.List;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.PaisDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.PaisEntity;

@Mapper(componentModel = "spring")
public interface PaisMapper {
	
	PaisDTO toDto(PaisEntity e);
	
	List<PaisDTO> toListDTO(List<PaisEntity> lstEntity);
	
	
	default Page<PaisDTO> toListDTO(Page<PaisEntity> lstEntity){
		return lstEntity.map(this::toDto);
	}
}
