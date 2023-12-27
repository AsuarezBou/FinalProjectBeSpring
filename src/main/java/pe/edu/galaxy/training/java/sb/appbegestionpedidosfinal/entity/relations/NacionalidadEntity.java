package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.PaisEntity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Nacionalidad")
@Table(name = "nacionalidad")
public class NacionalidadEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_nacionalidad")
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "id_pais", nullable = false)
	private PaisEntity pais;
	
	@Column
	private String descripcion;
}
