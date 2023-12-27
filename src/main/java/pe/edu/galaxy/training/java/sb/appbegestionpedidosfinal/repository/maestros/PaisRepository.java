package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.maestros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.PaisEntity;

@Transactional
@Repository
public interface PaisRepository extends JpaRepository<PaisEntity,Long> {

}
