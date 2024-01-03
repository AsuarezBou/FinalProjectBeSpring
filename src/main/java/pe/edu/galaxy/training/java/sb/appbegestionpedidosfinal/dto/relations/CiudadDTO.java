package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CiudadDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nombre;
	
	private ProvinciaDTO provincia;

}
