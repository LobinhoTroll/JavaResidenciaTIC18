package somaInteiros;

import java.util.Scanner;

public class Soma {
	public int somaInteiro(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int a,b;
		Soma soma = new Soma();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os numeros a serem somados: ");
		System.out.println();
		
		System.out.println("a: ");
		a = sc.nextInt();
		System.out.println();
		
		System.out.println("b: ");
		b = sc.nextInt();
		System.out.println();
		
		System.out.println("Resultado: a + b = "+soma.somaInteiro(a, b));
	}
}
