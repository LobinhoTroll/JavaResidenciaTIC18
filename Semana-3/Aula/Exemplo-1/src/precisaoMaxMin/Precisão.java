package precisaoMaxMin;

public class Precisão {

	public static void main(String[] args) {
		float x,y;
		x = 2;
		do {
			y = x;
			x = x/2;
		} while(x>0);
		System.out.println("Float: "+y);
		double X,Y;
		X = 2;
		do {
			Y = X;
			X = X/2;
		} while(X>0);
		System.out.println("Double: "+Y);
	}
}
