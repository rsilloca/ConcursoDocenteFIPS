package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;

import java.util.List;


@Data
@Entity
public class TipoVacante {
	@Id
	long id;
	String nombre;
	String Descripcion;

	@OneToMany(mappedBy = "tipoVacante", cascade = CascadeType.ALL)
	private List<Plaza> plazas;
}
