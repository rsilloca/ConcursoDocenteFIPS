package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Concursante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "concursante",cascade = CascadeType.ALL, optional = true)
    @PrimaryKeyJoinColumn
    private Nota nota;

    private int dni;

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    @ManyToOne(optional = true)
    private Plaza plaza;

    public String getNombreCompleto() {
        return nombres + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}
