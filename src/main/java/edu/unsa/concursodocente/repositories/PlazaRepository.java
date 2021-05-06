package edu.unsa.concursodocente.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.unsa.concursodocente.models.Concursante;
import edu.unsa.concursodocente.models.Plaza;



public interface PlazaRepository extends JpaRepository<Plaza, Long>{
    List<Plaza> findAllByConcursoId(long id);
}
