package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String email;
	String password;

	@OneToOne(cascade = CascadeType.ALL)
	private Evaluador evaluador;
}
