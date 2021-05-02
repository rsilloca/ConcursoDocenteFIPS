package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;

import java.util.List;

@Data
@Entity
public class Regimen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String nombreCroto;
	String descripcion;

	@OneToMany(mappedBy = "regimen", cascade = CascadeType.ALL)
	private List<Plaza> plazas;
}
