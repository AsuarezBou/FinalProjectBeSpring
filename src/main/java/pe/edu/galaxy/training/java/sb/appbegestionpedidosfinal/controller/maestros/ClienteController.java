package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.controller.maestros;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.dto.maestros.ClienteDTO;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.exception.ServiceException;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.service.maestros.ClienteService;

@RestController
@RequestMapping("api/v1/clientes")
public class ClienteController {
	private final ClienteService clienteService;

	public ClienteController(final ClienteService clienteService) {
		super();
		this.clienteService = clienteService;
	}

	@GetMapping
	public ResponseEntity<?> findAll() throws ServiceException {
		try {
			List<ClienteDTO> clientes = clienteService.findAll();
			if(clientes.isEmpty()) {
				return ResponseEntity.noContent().build();
			}
			
			return ResponseEntity.ok(clientes);
			
		}catch(Exception e) {
			return ResponseEntity.internalServerError().body(null);

		}
	}

	/*
	 * @GetMapping("/by-razonSocial") public List<ClienteEntity>
	 * findByLikeRazonSocial(@RequestParam String razonSocial) { return
	 * clienteService.findByLikeRazonSocial(razonSocial); }
	 * 
	 * @GetMapping("/{id}") public Optional<ClienteEntity> findById(@PathVariable
	 * Long id) { return clienteService.findById(id); }
	 * 
	 * @PostMapping public ClienteEntity save(@RequestBody ClienteEntity
	 * clienteEntity) { return clienteService.save(clienteEntity); }
	 * 
	 * @PutMapping("/{id}") public ClienteEntity update(@PathVariable Long
	 * id, @RequestBody ClienteEntity clienteEntity) { clienteEntity.setId(id);
	 * return clienteService.update(clienteEntity); }
	 * 
	 * @DeleteMapping("/{id}") public void delete(@PathVariable Long id) {
	 * clienteService.delete(id); }
	 */
}
