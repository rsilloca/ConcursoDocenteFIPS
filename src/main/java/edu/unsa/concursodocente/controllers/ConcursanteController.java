package edu.unsa.concursodocente.controllers;

import edu.unsa.concursodocente.repositories.ConcursanteRepository;
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
}
