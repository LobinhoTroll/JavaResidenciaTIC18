package verificaçãoMaiorIdade;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Verificação2 {
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	public static void main(String[] args) {
		Verificação2 verificação = new Verificação2();
		String idade;
		Scanner sc = new Scanner(System.in);
		String[] idadeParced;
		
		System.out.println("Digite sua idade: xx/xx/xxxx");
		idade = sc.nextLine();
		
		idadeParced = idade.split("/",3);
		
		LocalDate nascimento = LocalDate.of(Integer.parseInt(idadeParced[2]),Integer.parseInt(idadeParced[1]),Integer.parseInt(idadeParced[0]));
		LocalDate hoje = LocalDate.now();
		
		long idad = java.time.temporal.ChronoUnit.YEARS.between(nascimento, hoje);
		
		if(idad > 18) {
			System.out.println("Você é maior de idade.");
		}else {
			System.out.println("Você é menor de idade.");
		}
	}
	
}
