package edu.unsa.concursodocente.repositories;

import edu.unsa.concursodocente.models.Requerimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequirementRepository extends JpaRepository<Requerimiento,Long> {
}
