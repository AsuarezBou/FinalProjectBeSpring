package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Genero")
@Table(name = "genero")
public class GeneroEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_genero")
	private Long id;
	
	@Column(name = "descripcion")
	private String descripcion;

	public GeneroEntity(Long id) {
		super();
		this.id = id;
	}

}
