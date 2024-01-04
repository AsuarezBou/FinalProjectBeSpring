package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaVODTOResponse implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nombre;
	
	private String nacionalidad;
	
	private String genero;
	
	private String tipoDocumento;
	
	private String numeroDocumento;
	
	private String fechaNacimiento;
	
	private String direccion;
	
	private String distrito;
	
	private String ciudad;
	
	private String provincia;

}
