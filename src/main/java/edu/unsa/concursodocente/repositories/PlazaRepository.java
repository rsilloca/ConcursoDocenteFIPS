package edu.unsa.concursodocente.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.unsa.concursodocente.models.Concursante;
import edu.unsa.concursodocente.models.Plaza;



public interface PlazaRepository extends JpaRepository<Plaza, Long>{
	List<Concursante> findAllByPlazaId(long id);
    @Query(nativeQuery = true, value = "select * from concursante\n" +
            "join plaza p on concursante.plaza_id = p.id\n" +
            "join concurso c on p.concurso_id = c.id\n" +
            "join nota n on concursante.id = n.concursante_id\n" +
            "where concursante.plaza_id = :idPlaza "+
            "order by nota_final desc ")
    List<Concursante> findRankingByPLazaId(@Param("idPlaza") Long id);
}
