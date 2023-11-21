package trocaDeVariáveis;

public class Troca1 {
	public static void main(String[] args) {
		int x = 1,y = 2,z;
		System.out.println("X = "+x+" Y = "+y);
		z = x;
		x = y;
		y = z;
		System.out.println("X = "+x+" Y = "+y);
	}
}
