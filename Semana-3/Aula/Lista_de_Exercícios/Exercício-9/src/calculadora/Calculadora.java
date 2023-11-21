package calculadora;

import java.util.Scanner;

public class Calculadora {
	private float num1,num2;
//Construtores
	Calculadora(){
		num1 = 0;
		num2 = 0;
	}
//Getters
	public float getNum1() {
		return num1;
	}
	public float getNum2() {
		return num2;
	}
//Setters
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	};
//Funções
	public float soma() {
		return this.num1 + this.num2;
	}
	public float subtração() {
		return this.num1 - this.num2;
	}
	public float multiplicação() {
		return this.num1 * this.num2;
	}
	public float divisão() {
		return this.num1 / this.num2;
	}
	
	public void preencherNumeros(){
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		num1 = sc.nextInt();
		this.setNum1(num1);
				
		System.out.println("Agora informe o segundo:");
		num2 = sc.nextInt();
		this.setNum2(num2);
		
	}
	public void printSoma() {
		System.out.println("A soma é: "+this.soma());
	}
	public void printSubtração() {
		System.out.println("A subtração é: "+this.subtração());
	}
	public void printMultiplicação() {
		System.out.println("A multiplicação é: "+this.multiplicação());
	}
	public void printDivisão() {
		System.out.println("A divisão é: "+this.divisão());
	}

}
