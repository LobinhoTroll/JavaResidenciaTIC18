package jogoAdivinhação;

import java.util.Scanner;

public class Adivinhação {
	private int alNum;
//Getters
	public int getAlNum() {
		return alNum;
	}
//Setters
	public void setAlNum() {
		double doubleRandomNumber = Math.random() * 100 + 1;
		this.alNum = (int)doubleRandomNumber;
	}
//Methods
	public void Adivinhação() {
		
		this.setAlNum();
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		while (this.getAlNum() != numero) {
			System.out.println("Tente adivinhar o numero: ");
			numero = sc.nextInt();
			if(this.getAlNum() < numero) {
				System.out.println("Está mais abaixo.");
				System.out.println();
			}else if(this.getAlNum() > numero) {
				System.out.println("Está mais acima.");
				System.out.println();
			}else {
				System.out.println("Parabens você acertou!");
			}
		}
	
	}

public static void main(String[] args) {
	Adivinhação partida = new Adivinhação();
	partida.Adivinhação();
}
}
