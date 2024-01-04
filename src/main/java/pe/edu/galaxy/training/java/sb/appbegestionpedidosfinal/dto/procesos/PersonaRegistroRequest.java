package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.procesos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaRegistroRequest {
	
	@NotNull(message = "Los nombres son requeridos")
	private String nombres;
	
	@NotNull(message = "El apellido materno es requerido")
	private String apellidoMaterno;
	
	@NotNull(message = "El apellido paterno es requerido")
	private String apellidoPaterno;
	
	@NotNull(message = "La fecha de nacimiento es requerida")
	private String fechaNacimiento;
	
	@NotNull(message = "El id de la nacionalidad es requerido")
	@Positive(message = "El id de la nacionalidad debe ser positivo")
	private Long nacionalidad;
	
	@NotNull(message = "El id del genero es requerido")
	@Positive(message = "El id del genero debe ser positivo")
	private Long genero;
	
	@NotNull(message = "El id del tipo de documento es requerido")
	@Positive(message = "El id del tipo de documento debe ser positivo")
	private Long tipoDocumento;
	
	@NotNull(message = "El numero de documento es requerido")
	private String numeroDocumento;
	
	@NotNull(message = "La direccion es requerida")
	private String direccion;
	
	@NotNull(message = "El id del distrito es requerido")
	@Positive(message = "El id del distrito debe ser positivo")
	private Long distrito;

}
