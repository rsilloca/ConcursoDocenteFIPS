package edu.unsa.concursodocente.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jefferson Farfán
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Plaza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private int number;

    @ManyToOne
    private DepartamentoAcademico departamentoAcademico;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Requerimiento> requerimientos;

    @ManyToMany(mappedBy = "plazas")
    private List<Asignatura> asignaturas;

    @OneToMany(mappedBy = "plaza", cascade = CascadeType.ALL)
    private List<Evaluador> evaluadores;

    @ManyToOne
    private TipoVacante tipoVacante;

    @ManyToOne
    private Regimen regimen;

    public Plaza(int number){
        this.number = number;
    }
}
