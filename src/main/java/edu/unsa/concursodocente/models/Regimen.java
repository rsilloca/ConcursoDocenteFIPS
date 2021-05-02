package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Regimen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String nombreCroto;
	String descripcion;
}