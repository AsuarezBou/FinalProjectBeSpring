package pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.repository.procesos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.galaxy.training.java.sb.appbegestionpedidosfinal.entity.relations.PersonaEntity;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Long>{
	
	//JPQL
	@Query("Select p from Persona p where upper(numeroDocumento) like upper(:numeroDocumento)")
	PersonaEntity findByDocumentNumber(@Param("numeroDocumento") String numeroDocumento);

}
