package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.DocumentosEntity;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.GeneroEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Persona")
@Table(name = "persona")
public class PersonaEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Long id;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellido_pat")
	private String apellidoPaterno;
	
	@Column(name = "apellido_mat")
	private String apellidoMaterno;
	
	@Column(name = "fecha_nacimiento")
	private String fechaNacimiento;
	
	@Column(name = "num_documento")
	private String numeroDocumento;
	
	@Column(name = "direccion")
	private String direccion;
	
	@ManyToOne
	@JoinColumn(name = "id_nacionalidad", nullable = false)
	private NacionalidadEntity nacionalidad;
	
	@ManyToOne
	@JoinColumn(name = "id_genero",nullable = false)
	private GeneroEntity genero;
	
	@ManyToOne
	@JoinColumn(name = "id_documento", nullable = false)
	private DocumentosEntity documento;
	
	@ManyToOne
	@JoinColumn(name = "id_distrito", nullable = false)
	private DistritoEntity distrito;
	
	

}
