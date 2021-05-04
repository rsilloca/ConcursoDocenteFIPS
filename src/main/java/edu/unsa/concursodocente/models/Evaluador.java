package edu.unsa.concursodocente.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Evaluador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellidos;
    @Column(nullable = false)
    private String dni;
    @Column(nullable = false)
    private String email;
    @ManyToOne
    private TipoEvaluador tipoEvaluador;
    @ManyToOne
    private Plaza plaza;
    @OneToOne(cascade = CascadeType.ALL)
    private Cuenta cuenta;

    @OneToMany(mappedBy = "evaluador")
    private Set<NotaClase> notasClase;

    public Evaluador(String nombre, String apellidos, String dni, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
    }
}
