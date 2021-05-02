package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class TipoVacante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	private String nombre;
	private String descripcion;

}
