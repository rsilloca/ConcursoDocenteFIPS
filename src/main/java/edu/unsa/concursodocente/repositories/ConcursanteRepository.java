package edu.unsa.concursodocente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unsa.concursodocente.models.Concursante;

public interface ConcursanteRepository extends JpaRepository<Concursante, Long> {
}
