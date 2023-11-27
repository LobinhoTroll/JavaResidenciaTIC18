package conversorDeMoedas;

import java.util.Scanner;

public class Conversor {
	private float dolar,taxa;
	private String moeda2;
	Conversor(){
		dolar = 0;
		taxa = 0;
		moeda2 = "";
	}
//Getters
	public float getDolar() {
		return dolar;
	}
	public float getTaxa() {
		return taxa;
	}
	public String getMoeda2() {
		return moeda2;
	}
//Setters
	public void setDolar(float dolar) {
		this.dolar = dolar;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	public void setMoeda2(String moeda2) {
		this.moeda2 = moeda2;
	}
//Methods
	public float converção() {
		return this.getDolar()*this.getTaxa();
	}
	public void exibirConverção() {
		System.out.println(this.getDolar()+" dolares em "+this.getMoeda2()+" = "+this.converção()+" reais.");
	}
	public void inserirInformações() {
		float dolar,taxa;
		String moeda2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade em dolares a ser convertida:");
		dolar = sc.nextFloat();
		
		System.out.println("Informe a taxa de cambio:");
		taxa = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Informe o nome da moeda ao qual o dolar foi convertido:");
		moeda2 = sc.nextLine();
	
		this.setDolar(dolar);
		this.setTaxa(taxa);
		this.setMoeda2(moeda2);
	}

public static void main(String[] args) {
	Conversor converção = new Conversor();
	converção.inserirInformações();
	converção.exibirConverção();
}

}



