package areaDeUmRetangulo;

import java.util.Scanner;

public class Retângulo {
	public float area(float b,float h) {
		return b*h;
	}	
	
	public static void main(String[] args) {
		float b,h;
		Retângulo retangulo = new Retângulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome a altura do quadrado: ");
		h = sc.nextFloat();
		
		System.out.println("Infome o comprimento da base do quadrado: ");
		b = sc.nextFloat();
		System.out.println();
		
		System.out.println("Área do quadrado: "+retangulo.area(b, h));
	}
}
