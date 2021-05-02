package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @ManyToMany(mappedBy = "asignatura")
    private List<Plaza> plazas;
    private String nombre;
}
