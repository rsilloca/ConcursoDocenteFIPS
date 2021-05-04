package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;

import java.util.List;
import java.util.Set;


@Data
@Entity
public class TipoVacante {
	@Id
	long id;
	String nombre;
	String Descripcion;

	@OneToMany(mappedBy = "tipoVacante", cascade = CascadeType.ALL)
	private Set<Plaza> plazas;
}
