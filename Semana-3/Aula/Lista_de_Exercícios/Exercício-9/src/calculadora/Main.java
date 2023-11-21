package calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char escolha;
		Calculadora calculo = new Calculadora();
		//Preenchimento
		calculo.preencherNumeros();
		//Menu de escolhas
		System.out.println("Informe a operação desejada: \n a. Para adição \n s. Para subtração \n m. Para multiplicação \n d. Para divisão \n Opção escolhida:");
		Scanner sc = new Scanner(System.in);
		escolha = sc.nextLine().charAt(0);
		switch(escolha) {
		case 'a':
			calculo.printSoma();
			break;
		case 's':
			calculo.printSubtração();
			break;
		case 'm':
			calculo.multiplicação();
			break;
		case 'd':
			calculo.printDivisão();
			break;
		};
		
	}
}
