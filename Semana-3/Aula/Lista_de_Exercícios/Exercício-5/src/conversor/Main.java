package conversor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ConversorVersão1 conversao1 = new ConversorVersão1();
		conversao1.informarTemperatura();
		conversao1.printEscolhaConversão();
		
		int escolha;
		float temp;
		ConversorVersão2 conversao2 = new ConversorVersão2();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura: ");
		temp = sc.nextFloat();
		
		System.out.println("Informe a converção desejada:\n0. C°->F° \n1. F°->C°");
		escolha = sc.nextInt();
		
		conversao2.Conversão(temp, escolha);
	}
}

