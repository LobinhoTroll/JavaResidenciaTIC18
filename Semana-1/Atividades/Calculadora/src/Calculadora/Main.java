package Calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int escolha;
		Calculadora calculo = new Calculadora();
		//Preenchimento
		calculo.preencherNumeros();
		//Menu de escolhas
		System.out.println("Informe a operação desejada: \n 1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão \n Opção escolhida:");
		Scanner sc = new Scanner(System.in);
		escolha = sc.nextInt();
		switch(escolha) {
		case 1:
			calculo.printSoma();
			break;
		case 2:
			calculo.printSubtração();
			break;
		case 3:
			calculo.multiplicação();
			break;
		case 4:
			calculo.printDivisão();
			break;
		};
		
	}
}
