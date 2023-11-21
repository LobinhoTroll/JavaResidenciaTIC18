package conversor;

import java.util.Scanner;

public class ConversorVersão2 {
	public void Conversão(float temp, int escolha){
		if(escolha == 1){
			System.out.println(temp+"°F = "+(temp - 32) * 5/9+"°C");
		}else {
			System.out.println(temp+"°C = "+(temp * 9/5) + 32+"°F");
		}
	}
}
