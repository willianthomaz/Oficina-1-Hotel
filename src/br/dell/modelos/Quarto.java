package br.dell.modelos;

public class Quarto {
	private int numero;
	private Hospede hospede;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	public Quarto(int numero, Hospede hospede) {
		this.numero = numero;
		
	}

}
