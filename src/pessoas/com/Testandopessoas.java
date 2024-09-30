package pessoas.com;

//Nessa classe vai ser instanciado tudo que foi criado nas outras classes/*
public class Testandopessoas {

	//instanciando pessoa fisica/*
	public static void main(String[] args) {
	PessoaFisica pf1 = new PessoaFisica();
	pf1.setnome("Ricardo Oliveira");
	pf1.setcpf("230.088.480-78");
	pf1.setemail("ricardooliveira@gmail.com");
	pf1.setendereco("Rua texas- 206");
	System.out.println(pf1.getnome());
	
	//instanciando pessoa juridica/*
	PessoaJuridica pj1 = new PessoaJuridica();
	pj1.setnome("Ricardotransportes");
	pj1.setemail("Ricardotranportadora@gmail.com");
	pf1.setendereco("Rua laxess - 578");
	pj1.setcnpj("400.700.570-89");
	System.out.println(pj1.getemail());
	
	//instanciando funcionario/*
	Funcionarios f1 = new Funcionarios();
	f1.setnome("Thomaz Silva");
	f1.setcpf("200.308.455-76");
	f1.setendereco("Rua chbdsjsjs-789");
	f1.setsalario(1999.00);
	System.out.println(f1.getsalario());

	}

}
