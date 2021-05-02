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
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Plaza> plazas;
    private String nombre;
    //edu.unsa.concursodocente.models.Asignatura.plaza in edu.unsa.concursodocente.models.Plaza.asignaturas
}
