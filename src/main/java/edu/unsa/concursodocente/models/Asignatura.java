package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String nombre;
}
