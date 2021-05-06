package edu.unsa.concursodocente.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.unsa.concursodocente.repositories.PlazaRepository;
import edu.unsa.concursodocente.services.PlazaService;
import edu.unsa.concursodocente.viewmodels.ConcursanteDetailGetResponse;
import edu.unsa.concursodocente.viewmodels.ListaPostulantesGetResponse;


@RestController
public class PlazaController {
	
	@Autowired
	private PlazaRepository repository;
	@Autowired
	private PlazaService service;
	
	 @GetMapping("concurso/{concursoId}/plazas/{plazaId}/rankings")
	    public List<ConcursanteDetailGetResponse> getRankingsPlaza(@PathVariable long concursoId, @PathVariable long plazaId){
	        var response= repository.findRankingByPLazaId(plazaId).stream()
	                .map(concursante -> ConcursanteDetailGetResponse.of(concursante))
	                .map(detail ->{
	                    return detail;
	                }).collect(Collectors.toList());
	        return response;
	    }

	@GetMapping("postulantes/")
	public List<ListaPostulantesGetResponse> getPostulantes(){
		var listaPostulante = service.obtenerTodasLasPlazas();
		return listaPostulante;
	}

}
