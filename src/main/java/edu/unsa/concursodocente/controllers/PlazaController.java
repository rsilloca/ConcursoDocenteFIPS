package edu.unsa.concursodocente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.unsa.concursodocente.repositories.PlazaRepository;
import edu.unsa.concursodocente.services.PlazaService;
import edu.unsa.concursodocente.viewmodels.ListaPostulantesGetResponse;
import edu.unsa.concursodocente.viewmodels.RankingPlazaGetResponse;

@RestController
public class PlazaController {
	
	@Autowired
	private PlazaRepository repository;
	@Autowired
	private PlazaService service;
	
	@GetMapping("ranking/")
	public List<RankingPlazaGetResponse> getRankink(){
		return null;
	}


	@GetMapping("postulantes/")
	public List<ListaPostulantesGetResponse> getPostulantes(){
		var listaPostulante = service.obtenerTodasLasPlazas();
		return listaPostulante;
	}

}
