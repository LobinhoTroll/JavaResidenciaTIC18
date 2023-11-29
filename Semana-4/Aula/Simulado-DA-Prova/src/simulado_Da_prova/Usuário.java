package simulado_Da_prova;

import java.util.ArrayList;

public class Usuário {
	private String nome,email,senha;
	private ArrayList<String> ListaPostagens;
	
	
//Getters
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public ArrayList<String> getListPostagem() {
		return ListaPostagens;
	}
//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setListPostagem(ArrayList<String> listPostagem) {
		ListaPostagens = listPostagem;
	}
//Methods	
	public void novaPostagem(Sessão novapostagem) {
}
	public void Logar() {
		Sessão sessão = new Sessão();
		int continuar = 0,escolha;
		while(continuar == 0) {
			switch (escolha) {
			case 1: {
			}
			case 2:{
			sessão.criarAmizade(null);	
			}
			case 3:{
			sessão.destruirAmizade(null);
			}
			case 4:{
			sessão.Deslogar();
			}
			}
		}
	}

}
	