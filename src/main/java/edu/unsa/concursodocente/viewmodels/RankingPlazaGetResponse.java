package edu.unsa.concursodocente.viewmodels;

import java.util.List;
import java.util.Set;

import edu.unsa.concursodocente.models.Plaza;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RankingPlazaGetResponse {
	
	private long id;
	private Set<NotaConcursanteGetResponse> aplicantes;
	
	public static RankingPlazaGetResponse of(Plaza plaza) {
		var response = builder()
			.id(plaza.getId())
			.build();
		
		response.setAplicantes(plaza.getAplicantes());
		return response;
	}
	
	

}
