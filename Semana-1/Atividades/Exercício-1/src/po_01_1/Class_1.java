package po_01_1;

public class Class_1 {
	Class_1(){
		b = 4;
		h = 5;
	}
	private int b,h;
		
	public int getX() {
		return b;
	}
	public int getY() {
		return h;
	}
	public void setNome(int b) {
		this.b = b;
	}
	public void setSenha(int h) {
		this.h = h;
	}
	public int Area() {
		return (this.getX()*this.getY())/2;
	}

public static void main(String[] args) {
	Class_1 triangulo = new Class_1();
	
	System.out.println("Área = "+triangulo.Area()+"M²");
}


/*C++

Class Class_2

class Class_2
{
	 int x,y;  //São atributos privados por default
public:
	void getX();
	void getY();
	void setX(int x);
	void setY(int Y);
	public int Area();
	};
*/}
