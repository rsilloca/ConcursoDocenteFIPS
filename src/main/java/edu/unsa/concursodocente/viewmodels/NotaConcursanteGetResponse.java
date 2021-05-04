package edu.unsa.concursodocente.viewmodels;

import lombok.Data;

@Data
public class NotaConcursanteGetResponse {
	private String nombreCompleto;
	private long notafinal;
	private boolean aprovado;

}
