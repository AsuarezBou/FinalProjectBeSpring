package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GeneroDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String descripcion;

}
