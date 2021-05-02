package edu.unsa.concursodocente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unsa.concursodocente.models.Concurso;
import edu.unsa.concursodocente.models.TipoVacante;

public interface TipoVacanteRepository extends JpaRepository<TipoVacante, Long>{

}
