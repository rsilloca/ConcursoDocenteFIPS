package edu.unsa.concursodocente.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TipoEvaluador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    String nombre;
    @Column(nullable = false)
    String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoevaluador")
    private List<Evaluador> evaluadores;

    public TipoEvaluador(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
