package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.relations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.DistritoEntity;

@Repository
public interface DistritoRepository extends JpaRepository<DistritoEntity,Long> {

}
