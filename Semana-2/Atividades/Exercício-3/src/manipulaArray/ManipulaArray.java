package manipulaArray;

import java.util.Scanner;

public class ManipulaArray {
	private int userNum;
	private int[] array = new int[10];  

//Getters	
	public int getUserNum() {
		return userNum;
	}
	public int[] getArray() {
		return array;
	}
//Setters	
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public void setArrayUser() {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o "+(i+1)+"° numero");
			numero = sc.nextInt();
			this.array[i] = numero;
		}
		
	}
	public void setArraySystem() {
		for (int i = 0; i < 10; i++) {
			double doubleRandomNumber = Math.random() * 100 + 1;
			this.array[i] = (int)doubleRandomNumber;
		}
	}
//Methods
	public int maiorNumero() {
		int verificador = Integer.MIN_VALUE,maior = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > verificador) {
				verificador = array[i];
				maior = verificador;
			}
			
		}
		return maior;
	}
	public int menorNumero() {
		int verificador = Integer.MAX_VALUE,menor = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] < verificador) {
				verificador = array[i];
				menor = verificador;
			}
			
		}
		return menor;
	}
	
	public void printArray() {
		System.out.print("Array = {");
		for (int i = 0; i < array.length; i++) {
			if(i < array.length) {
				System.out.print(array[i]+","); 
			}
			if(i == array.length-1) {
				System.out.print(array[i]+".}");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ManipulaArray manipulação = new ManipulaArray();
		manipulação.setArrayUser();
		manipulação.printArray();
		System.out.println("Maior valor presente no array fornecido pelo usuário: "+manipulação.maiorNumero()+" ,Menor valor: "+manipulação.menorNumero());
		System.out.println();
		
		
		manipulação.setArraySystem();
		manipulação.printArray();
		System.out.println("Maior valor presente no array criado pelo sistema: "+manipulação.maiorNumero()+" ,Menor valor: "+manipulação.menorNumero());
		System.out.println();
	}	
}
