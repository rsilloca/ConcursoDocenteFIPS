package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Concursante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "concursante",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Nota nota;

    private int dni;

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    @ManyToOne
    private Plaza plaza;
    
    private boolean estado;

    public String getNombreCompleto() {
        return nombres + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}
