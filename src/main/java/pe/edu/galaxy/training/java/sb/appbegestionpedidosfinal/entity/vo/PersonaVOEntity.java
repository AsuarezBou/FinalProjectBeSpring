package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.vo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "PersonaVO")
@Table(name = "view_personas")
public class PersonaVOEntity implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_persona")
	private Long id;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Nacionalidad")
	private String nacionalidad;
	
	@Column(name = "Genero")
	private String genero;
	
	@Column(name = "Tipo_Documento")
	private String tipoDocumento;
	
	@Column(name = "Numero_Documento")
	private String numeroDocumento;
	
	@Column(name = "Fecha_Nacimiento")
	private String fechaNacimiento;
	
	@Column(name = "Direccion")
	private String direccion;
	
	@Column(name = "Distrito")
	private String distrito;
	
	@Column(name = "Ciudad")
	private String ciudad;
	
	@Column(name = "Provincia")
	private String provincia;

}
