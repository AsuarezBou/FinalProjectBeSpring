package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.procesos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.vo.PersonaVOEntity;

@Repository
public interface PersonaVORepository extends JpaRepository<PersonaVOEntity,Long> {

	//JPQL
	@Query("Select p from PersonaVO p where p.numeroDocumento like :numeroDocumento")
	List<PersonaVOEntity> findByLikeDocumentNumber(@Param("numeroDocumento") String numeroDocumento);
}

