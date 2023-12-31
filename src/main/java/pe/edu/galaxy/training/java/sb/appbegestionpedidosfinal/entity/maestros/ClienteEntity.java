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
@Entity(name = "Cliente")
@Table(name = "cliente")
public class ClienteEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id;
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	@Column(name = "ruc")
	private String ruc;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;

	@Column(name = "correo")
	private String correo;

	
	@Column(name = "estado")
	private String estado;


	public ClienteEntity(Long id) {
		super();
		this.id = id;
	}
	
}
