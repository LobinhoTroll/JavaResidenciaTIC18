package simulado_Da_prova;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sessão {
//Constructors
	Sessão(){
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		DataHoraInicio = dtf4.format(LocalDateTime.now());
	}
	
//Attributes
	public String DataHoraInicio,DataHoraFim;

//Getters
	public String getDataHoraInicio() {
		return DataHoraInicio;
	}
	public String getDataHoraFim() {
		return DataHoraFim;
	}
//Setters
	public void setDataHoraFim() {
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		DataHoraFim = dtf4.format(LocalDateTime.now());
	}
//Methods
	public void criarAmizade(Usuário amigo) {
		
	}
	public void destruirAmizade(Usuário amigo) {
		
	}
	public void solicitaAutenticacao() {
		String usuario,senha;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====lOGIN=====");
		System.out.println();
		
		System.out.println("Usuário: ");
		usuario = sc.nextLine();
	
		System.out.println("Senha: ");
		senha = sc.nextLine();
	
		if(Lista) {
			
		}
	}
	
	
	static void logar() {
		Sessão sessao = new Sessão();
	}
	public void Deslogar(){
		this.setDataHoraFim();
	}
}
