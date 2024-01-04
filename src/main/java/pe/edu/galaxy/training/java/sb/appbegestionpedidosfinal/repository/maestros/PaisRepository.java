package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.maestros;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.PaisEntity;


@Transactional
public interface PaisRepository extends JpaRepository<PaisEntity,Long> {
	
	@Query("Select p from Pais p")
	Page<PaisEntity> findByLikePage(Pageable page);

}
