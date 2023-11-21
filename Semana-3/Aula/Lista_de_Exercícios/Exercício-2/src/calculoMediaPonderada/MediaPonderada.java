package calculoMediaPonderada;

import java.util.Scanner;

public class MediaPonderada {
	public float mediaPonderada(float NT1,float NT2,float NT3,float PT1,float PT2,float PT3) {
		float mt1 = NT1 * PT1;
		float mt2 = NT2 * PT2;
		float mt3 = NT3 * PT3;
		float MP = (mt1+mt2+mt3)/(PT1+PT2+PT3;
		return MP;
	}
	
	public static void main(String[] args) {
		float NT1,NT2,NT3,PT1,PT2,PT3;
		Scanner sc = new Scanner(System.in);
		MediaPonderada media = new MediaPonderada();
		
		System.out.println("Informe a pontuação obtida na primeira nota: ");
		NT1 = sc.nextInt();
		System.out.println("Informe o peso da primeira nota: ");
		PT1 = sc.nextInt();
		System.out.println();

		System.out.println("Informe a pontuação obtida na segunda nota: ");
		NT2 = sc.nextInt();
		System.out.println("Informe o peso da segunda nota: ");
		PT2 = sc.nextInt();
		System.out.println();
		
		System.out.println("Informe a pontuação obtida na terceira nota: ");
		NT3 = sc.nextInt();
		System.out.println("Informe o peso da terceira nota: ");
		PT3 = sc.nextInt();
		System.out.println();
		
		System.out.println("A média ponderada das notas foi: "+media.mediaPonderada(NT1, NT2, NT3, PT1, PT2, PT3));
	}
}
