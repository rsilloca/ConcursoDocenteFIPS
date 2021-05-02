package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "TipoVacante")
public class TipoVacante {
	@Id
	long id;
	String nombre;
	String Descripcion;
}
