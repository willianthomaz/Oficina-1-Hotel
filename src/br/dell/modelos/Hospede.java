package br.dell.modelos;

public class Hospede {
	private long cpf;
	private long rg;
	private String nome;
	private int idade;
	private String endereco;
	
	
	// metodos getters e setters
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

    // metodo construtor com parametros
	public Hospede(String nome,long cpf, long rg, int idade, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = idade;
		this.endereco = endereco;
	}

}