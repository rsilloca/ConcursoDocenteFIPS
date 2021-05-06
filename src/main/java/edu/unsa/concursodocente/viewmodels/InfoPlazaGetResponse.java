package edu.unsa.concursodocente.viewmodels;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import edu.unsa.concursodocente.models.Concursante;
import edu.unsa.concursodocente.models.Plaza;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class InfoPlazaGetResponse {
	private PlazaInfoGetReponse plaza;
	private ConcursanteBasicInfoGetReponse concursante;

	@Data
	@AllArgsConstructor
	public class PlazaInfoGetReponse {
		private long id;
		private String tipo;
		private String regimen;
		private String departamentoAcademico;
		private List<String> asignaturas;
	}

	@Data
	@AllArgsConstructor
	public class ConcursanteBasicInfoGetReponse {
		private long id;
		private String nombresCompletos;
		private int dni;
	}

	public static InfoPlazaGetResponse of(Plaza plaza, Concursante concursante){
		var info = new InfoPlazaGetResponse();
		info.setConcursante(info.new ConcursanteBasicInfoGetReponse(
			concursante.getId(),
			concursante.getNombreCompleto(),
			concursante.getDni()
		));
		info.setPlaza(info.new PlazaInfoGetReponse(
			plaza.getId(),
			plaza.getTipoVacante().getNombre(),
			plaza.getRegimen().getNombreCroto(),
			plaza.getDepartamentoAcademico().getNombre(),
			plaza.getAsignaturas()
				.stream()
				.map(asignatura -> asignatura.getNombre())
				.collect(Collectors.toList())
		));
		return info;
	}
}
