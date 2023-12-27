package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(value = Include.NON_NULL)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String razonSocial;
	
	private String ruc;
	
	private String direccion;
	
	private String telefono;

	private String correo;

	private String estado;
	
	@JsonProperty
	public String getNombreCompleto() {
		/*
		 * if (ruc==null) { ruc=""; }
		 */
		return ruc.concat(" : ").concat(razonSocial);
	}
}
