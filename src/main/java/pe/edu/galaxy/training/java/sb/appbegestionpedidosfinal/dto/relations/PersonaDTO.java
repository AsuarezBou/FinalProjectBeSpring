package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.relations;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.DocumentosDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.GeneroDTO;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nombres;
	
	private String apellidoPaterno;
	
	private String apellidoMaterno;
	
	private String fechaNacimiento;
	
	private NacionalidadDTO nacionalidadDTO;
	
	private GeneroDTO genero;
	
	private DocumentosDTO documento;
	
	private String numeroDocumento;
	
	private String direccion;
	
	private DistritoDTO distrito;

}
