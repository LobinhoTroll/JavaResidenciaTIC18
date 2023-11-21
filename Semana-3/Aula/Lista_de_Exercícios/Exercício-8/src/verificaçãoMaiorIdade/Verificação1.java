package verificaçãoMaiorIdade;

import java.util.Scanner;

public class Verificação1 {
	public static void main(String[] args) {
		boolean resp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você nasceu antes de 2005? reponda com 0 para sim ou 1 para não");
		System.out.println("Resposta: ");
		resp = sc.nextBoolean();
		
		if(resp == true) {
			System.out.println("Você é maior de idade.");
		}else {
			System.out.println("Você é menor de idade.");
		}
	}
}
