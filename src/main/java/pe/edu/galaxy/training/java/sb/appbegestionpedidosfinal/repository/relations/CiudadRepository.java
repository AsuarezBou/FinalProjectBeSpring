package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.relations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.CiudadEntity;

@Transactional
@Repository
public interface CiudadRepository extends JpaRepository<CiudadEntity,Long>{

}
