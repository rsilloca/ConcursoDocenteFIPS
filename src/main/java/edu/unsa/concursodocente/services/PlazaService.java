package edu.unsa.concursodocente.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsa.concursodocente.repositories.PlazaRepository;

@Service
public class PlazaService {
	
	@Autowired
	private PlazaRepository plazaRepository;
}
