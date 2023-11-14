package Cliente;

import java.util.Scanner;

public class Cliente {
	private String nome,cpf;
	private int idade;
//Getters
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getCpf() {
		return cpf;
	}
//Setters
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

//Construtores
	Cliente(){}
	Cliente(String _nome,String _cpf){
		nome = _nome;
		idade = 0;
		cpf = _cpf;
	}
	
//Funções
	public void preencherDados(){
		String nome,cpf;
		int idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome =sc.nextLine();
		this.setNome(nome);
		
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		this.setIdade(idade);
		
		sc.nextLine();
		
		System.out.println("Informe seu cpf: ");
		cpf = sc.nextLine();
		this.setCpf(cpf);
		System.out.println();
	}
	public void printInfos(){
		System.out.println("Informações do usuário: ");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("CPF: "+this.getCpf());
		System.out.println();
	}
}
