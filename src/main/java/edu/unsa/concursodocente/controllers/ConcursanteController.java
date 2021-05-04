package edu.unsa.concursodocente.controllers;

import edu.unsa.concursodocente.repositories.ConcursanteRepository;
import edu.unsa.concursodocente.repositories.ConcursoRepository;
import edu.unsa.concursodocente.repositories.PlazaRepository;
import edu.unsa.concursodocente.viewmodels.ConcursanteDetailGetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ConcursanteController {
    @Autowired
    private ConcursanteRepository repository;
    private PlazaRepository plazaRepository;
    private ConcursoRepository concursoRepository;

    @GetMapping("concursantes/")
    public List<ConcursanteDetailGetResponse> getConcursantes(){
        var response = repository.findAll().stream()
                .map(concursante -> ConcursanteDetailGetResponse.of(concursante))
                .map(detail ->{
                    return detail;
                }).collect(Collectors.toList());
        return response;
    }

    @GetMapping("concursantes/{id}")
    public ConcursanteDetailGetResponse getInfoConcursante(@PathVariable("id") Long id){
        var response = repository.findById(id).orElseThrow();
        return ConcursanteDetailGetResponse.of(response);
    }

    @GetMapping("concurso/{concursoId}/plazas/{plazaId}/postulantes")
    public List<ConcursanteDetailGetResponse> getConcursantesPlaza(@PathVariable long concursoId, @PathVariable long plazaId){
        var response= repository.findAllByPlazaId(plazaId).stream()
                .map(concursante -> ConcursanteDetailGetResponse.of(concursante))
                .map(detail ->{
                    return detail;
                }).collect(Collectors.toList());
        return response;
    }

    @GetMapping("concurso/{concursoId}/plazas/{plazaId}/rankings")
    public List<ConcursanteDetailGetResponse> getRankingsPlaza(@PathVariable long concursoId, @PathVariable long plazaId){
        var response= repository.findRankingByPLazaId(plazaId).stream()
                .map(concursante -> ConcursanteDetailGetResponse.of(concursante))
                .map(detail ->{
                    return detail;
                }).collect(Collectors.toList());
        return response;
    }
}
