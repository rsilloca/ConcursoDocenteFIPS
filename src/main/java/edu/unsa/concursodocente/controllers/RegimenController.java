package edu.unsa.concursodocente.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.unsa.concursodocente.models.Regimen;
import edu.unsa.concursodocente.repositories.RegimenRepository;
import edu.unsa.concursodocente.viewmodels.RegimenDetailGetResponse;
import edu.unsa.concursodocente.viewmodels.RegimenesPostRequest;

@RestController
public class RegimenController {

	 @Autowired
	 private RegimenRepository repository;
	 
	 @GetMapping("regimenes/")
	 public List<RegimenDetailGetResponse> getConcursos() {
	        var response = repository.findAll().stream()
	                .map(regimen -> RegimenDetailGetResponse.of(regimen))
	                .map(detail -> {
	                    return detail;
	                }).collect(Collectors.toList());
	        return response;
	    }
	 
	  @PostMapping("regimenes/")
	    public void createConcurso(@RequestBody RegimenesPostRequest request) {
	        var nuevoRegimen = request.toRegimen();
	        repository.save(nuevoRegimen);
	    }

}
