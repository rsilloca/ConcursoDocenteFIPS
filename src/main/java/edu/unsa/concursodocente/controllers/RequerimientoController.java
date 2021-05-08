package edu.unsa.concursodocente.controllers;

import edu.unsa.concursodocente.models.Requerimiento;
import edu.unsa.concursodocente.repositories.RequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequerimientoController {
    @Autowired
    public RequirementRepository repository;

    @GetMapping("/requerimientos")
    public List<Requerimiento> getRequirements(){
        return repository.findAll();
    }

    @PostMapping("/requerimientos")
    public Requerimiento createRequirement(@RequestBody Requerimiento requerimiento){
        return repository.save(requerimiento);
    }
}
