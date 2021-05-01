package edu.unsa.concursodocente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unsa.concursodocente.models.Concurso;
import edu.unsa.concursodocente.models.Cronograma;

public interface CronogramaRepository extends JpaRepository<Cronograma, Long>{
}
