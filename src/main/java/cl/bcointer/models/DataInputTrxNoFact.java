package cl.bcointer.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DataInputTrxNoFact {
	@JsonProperty("canal")
	@NotNull(message = "Not Found")
	@Size(min=2, max=2, message = "Largo de caracteres invalido")
	private String canal;
	
	@JsonProperty("num_cta_tar")
	@NotNull(message = "Not Found")
	@Size(min=19, max=19, message = "Largo caracteres  invalido")
	private String numCtaTar;
	

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getNumCtaTar() {
		return numCtaTar;
	}

	public void setNumCtaTar(String numCtaTar) {
		this.numCtaTar = numCtaTar;
	}

	public DataInputTrxNoFact() {
		super();
	}
	
	
	
	
	
	
}