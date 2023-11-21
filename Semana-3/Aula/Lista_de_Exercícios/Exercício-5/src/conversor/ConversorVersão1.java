package conversor;

import java.util.Scanner;

public class ConversorVersão1 {
	private float T;
//Construtores
	ConversorVersão1(){
		T = 0;
	}
//Getters
	public float getTemperatura() {
		return T;
	}
//Setters
	public void setTemperatura(float t) {
		T = t;
	}
//Funções	
	public float celciusParaFahrenheit() {
		T = (T * 9/5) + 32;
		return T;
	}
	public float fahrenheitParaCelcius() {
		T = (T - 32) * 5/9;
		return T;
	}
	public void informarTemperatura(){
		float T;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura:");
		T = sc.nextInt();
		this.setTemperatura(T);
		
	}
	public void printEscolhaConversão(){
		int escolha;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a qual converter: \n 1.Celcius \n 2.Fahrenheit");
		escolha = sc.nextInt();
		if(escolha == 1){
			System.out.println(this.getTemperatura()+"°F = "+this.fahrenheitParaCelcius()+"°C");
		}else {
			System.out.println(this.getTemperatura()+"°C = "+this.celciusParaFahrenheit()+"°F");
			
		}
		
	}
	
}
