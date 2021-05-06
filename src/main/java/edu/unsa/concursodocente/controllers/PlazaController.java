package edu.unsa.concursodocente.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.unsa.concursodocente.models.DepartamentoAcademico;
import edu.unsa.concursodocente.models.Plaza;
import edu.unsa.concursodocente.repositories.ConcursanteRepository;
import edu.unsa.concursodocente.repositories.ConcursoRepository;
import edu.unsa.concursodocente.repositories.PlazaRepository;
import edu.unsa.concursodocente.services.PlazaService;
import edu.unsa.concursodocente.viewmodels.ConcursanteDetailGetResponse;
import edu.unsa.concursodocente.viewmodels.ConcursoPostRequest;
import edu.unsa.concursodocente.viewmodels.PlazaGetResponse;
import edu.unsa.concursodocente.viewmodels.PlazaPostRequest;


@RestController
public class PlazaController {
	@Autowired
	private ConcursoRepository concursoRepository;
	@Autowired
	private PlazaRepository plazaRepository;
	@Autowired
	private ConcursanteRepository concursanteRepository;

	@Autowired
	private PlazaService service;

	@GetMapping("concurso/{concursoId}/plazas/{plazaId}/rankings")
	public List<ConcursanteDetailGetResponse> getRankingsPlaza(@PathVariable long concursoId,
			@PathVariable long plazaId) {
		var response = concursanteRepository.findRankingByPLazaId(plazaId).stream()
				.map(concursante -> ConcursanteDetailGetResponse.of(concursante)).map(detail -> {
					return detail;
				}).collect(Collectors.toList());
		return response;
	}

	@PostMapping("concurso/{id}/plazas")
	public PlazaGetResponse createPlaza(@PathVariable(name = "id") long id, @RequestBody PlazaPostRequest request) {
		var concurso = concursoRepository.findById(id).orElseThrow();

		var plaza = new Plaza();
		plaza.setConcurso(concurso);

		plazaRepository.save(plaza);
		// plaza.setNumber(request.getNumero());
		// var departament = new DepartamentoAcademico();
		// departament.setNombre(request.getDepartamentoAcademico());
		// plaza.setDepartamentoAcademico(departament);
		// departament.getPlazas().add(plaza);
		// plazaRepository.save(plaza);

		return PlazaGetResponse.of(plaza);
	}

	@GetMapping("concurso/{concursoId}/plazas/{plazaId}/postulantes")
	public List<ConcursanteDetailGetResponse> getPostulantes(@PathVariable long concursoId,
			@PathVariable long plazaId) {
		var plaza = plazaRepository.findById(plazaId).orElseThrow();

		var concursantes = concursanteRepository.findAllByPlazaId(plaza.getId()).stream()
				.map(concursante -> ConcursanteDetailGetResponse.of(concursante)).collect(Collectors.toList());

		return concursantes;
	}
}
