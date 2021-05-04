package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Plaza;
import lombok.Data;

@Data
public class ListaPostulantesGetResponse {

	private InfoPlazaGetResponse infoPlazaPostulante;

	public static Object of(Plaza plaza) {
		var response = builder()
				.id(plaza.getId())
				.build();
		return response;
	}
	//falta: manejo de la lista
}
