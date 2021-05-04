package edu.unsa.concursodocente.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Data
@Entity
public class Concursante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Nota nota;

    private int dni;

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public String getNombreCompleto() {
        return nombres + " " + apellidoPaterno + " " + apellidoPaterno;
    }
}
