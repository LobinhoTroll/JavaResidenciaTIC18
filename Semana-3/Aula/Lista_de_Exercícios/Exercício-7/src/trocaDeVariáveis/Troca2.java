package trocaDeVariáveis;

public class Troca2 {
	public static void main(String[] args) {
		int x = 1,y = 2;
		System.out.println("X = "+x+" Y = "+y);
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		System.out.println("X = "+x+" Y = "+y);	
	}
}
