package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.PaisDTO;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NacionalidadDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private PaisDTO pais;
	
	private String descripcion;
}
