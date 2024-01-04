package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.maestros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.maestros.DocumentosEntity;

@Repository
public interface DocumentosRepository extends JpaRepository<DocumentosEntity,Long>{

}
