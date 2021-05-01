package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Asignatura {
    @Id
    private long Id;
    private String nombre;
}
