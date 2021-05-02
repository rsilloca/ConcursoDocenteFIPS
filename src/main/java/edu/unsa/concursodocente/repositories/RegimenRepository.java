package edu.unsa.concursodocente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unsa.concursodocente.models.Regimen;

public interface RegimenRepository extends JpaRepository<Regimen, Long> {

}
