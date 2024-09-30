package pessoas.com;

//Criando a subclasse Funcionarios que vai ter como modelo a classe PessoaFisica
// Pois um funcionario é pessoafisica/*
public class Funcionarios extends PessoaFisica {
	//Criando o atributo exclusivo da classe/*
	private double salario;
	
	
	//Criando getters and setters/*
	public void setsalario(double salario) {
		this.salario = salario;
	}
	
	public double getsalario () {
		return salario;
	}
	
	
	
	

}
