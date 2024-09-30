package pessoas.com;


//Criando a subclasse PessoaJuridica e tranferindo para ela os atributos e metodos da superclasse/*
public class PessoaJuridica extends Pessoa {
	//Criando o atributo exclusivo dessa subclasse/*
	private String cnpj;
	
	// Criando getters and setters/*
	public void setcnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public String getcnpj() {
		return cnpj;
	}

}
