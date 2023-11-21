package verificaçãoDeParidade;

import java.util.Scanner;

public class Paridade {
	public void verificaçãoParidade(int num) {
		if(num % 2 == 0) {
			System.out.println(num+" é par.");
		}else {
			System.out.println(num+" é impar.");
		}
}
	public static void main(String[] args) {
		int num; 
		Scanner sc = new Scanner(System.in);
		Paridade requisição = new Paridade();
		
		System.out.println("Informe o número: ");
		num = sc.nextInt();
		System.out.println();
		
		requisição.verificaçãoParidade(num);
	}
}
