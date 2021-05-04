package edu.unsa.concursodocente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unsa.concursodocente.models.Evaluador;

public interface EvaluadorRepository extends JpaRepository<Evaluador, Long> {
}
