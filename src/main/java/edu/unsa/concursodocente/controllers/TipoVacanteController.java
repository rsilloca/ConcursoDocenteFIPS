package edu.unsa.concursodocente.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.unsa.concursodocente.repositories.TipoVacanteRepository;
import edu.unsa.concursodocente.viewmodels.TipoVacanteDetailGetResponse;
import edu.unsa.concursodocente.viewmodels.TipoVacantePostRequest;

public class TipoVacanteController {
	
	@Autowired
	private TipoVacanteRepository repository;
	
	
	 @GetMapping("TipoVacantes/")
	    public List<TipoVacanteDetailGetResponse> getTipoVacante() {
	        var response = repository.findAll().stream()
	                .map(tipoVacante -> TipoVacanteDetailGetResponse.of(tipoVacante))
	                .map(detail -> {
	                    return detail;
	                }).collect(Collectors.toList());
	        return response;
	    }
	 
	 @PostMapping("tipoVacantes/")
	    public void createConcurso(@RequestBody TipoVacantePostRequest request) {
	        var nuevoTipoVacante = request.toTipoVacante();
	        repository.save(nuevoTipoVacante);
	    }

}
