package po_01_1;

public class Class_2 {
	Class_2(){
		x = 4;
		y = 5;
	}
	private int x,y;
		
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int Area() {
		return this.getX()*this.getY();
	}

public static void main(String[] args) {
	Class_2 quadrado = new Class_2();
	
	System.out.println("Área = "+quadrado.Area()+"M²");
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
public int getX() {
		return b;
	}
public int getY() {
		return h;
	}
public void setX(int b) {
		this.b = b;
	}
public void setY(int h) {
		this.h = h;
	}
public int Area() {
	return (this.getBase()*this.getAltura())/2;
	}
int main(){

	cout<< "Área = " << quadrado.Area() << "M²" << endl;
}
*/}
