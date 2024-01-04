package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.commons;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class GenericResponse {
	
	private Integer code;
	
	private String message;
	
	private Object content;

}
