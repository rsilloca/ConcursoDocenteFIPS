package edu.unsa.concursodocente.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Concurso {
    @Id
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private Cronograma cronograma;

    private int añoAcadémico;
    private int periodo;
}
