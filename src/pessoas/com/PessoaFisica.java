package pessoas.com;

// Criando a subclasse Pessoafisica e tranferindo para ela os atributos e metodos da superclasse/*

public class PessoaFisica extends Pessoa {
	//Criando o atributo "exclusivo" da classe/*
	private String endereco;
	
	
	//Criando getters and setters/*
	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getendereco() {
		return endereco;
	}
}