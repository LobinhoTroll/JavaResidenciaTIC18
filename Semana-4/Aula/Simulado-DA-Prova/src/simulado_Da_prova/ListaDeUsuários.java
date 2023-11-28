package simulado_Da_prova;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeUsuários {
//Attributes
	private ArrayList<Usuário> ListaDeUsuários;
//Methods
	public void criarUsuario(Usuário novoUsuario){
		
		this.ListaDeUsuários.add(novoUsuario);
	}
	public void removerUsuario() {
		String usuario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o email ou nome do usuário a ser excluido: ");
		usuario = sc.nextLine();		
		
		for(int i = 0; i < ListaDeUsuários.size(); i++) {
			if(ListaDeUsuários.get(i).getNome().equals(usuario)){
				ListaDeUsuários.remove(i);
			}
		}
	}
}
