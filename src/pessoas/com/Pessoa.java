package pessoas.com;
// Criando a superclasse Pessoa  que vai servir de modelo para as subclasses/*

public class Pessoa {
	
	//criando os atributos/*
	private String nome;
	private String cpf;
	private String email;
	
	// criando os getters and setters/*
	public void setnome(String nome) {
		this.nome = nome;
		
	}
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public String getnome() {
		return nome;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	public String getemail() {
		return email;
	}
}
