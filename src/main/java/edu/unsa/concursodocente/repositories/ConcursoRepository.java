package edu.unsa.concursodocente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unsa.concursodocente.models.Concurso;

public interface ConcursoRepository extends JpaRepository<Concurso, Long>{
}
