package edu.unsa.concursodocente.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsa.concursodocente.repositories.PlazaRepository;
import edu.unsa.concursodocente.viewmodels.ListaPostulantesGetResponse;

@Service
public class PlazaService {
	
	@Autowired
	private PlazaRepository plazaRepository;
	
	public List<ListaPostulantesGetResponse> obtenerTodasLasPlazas(){
		var plazas = plazaRepository.findAll()
	            .stream()
	            .map(c -> ListaPostulantesGetResponse.of(c))
	            .collect(Collectors.toList());
		
	        return plazas;
	}

}
