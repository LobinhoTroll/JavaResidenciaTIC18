package po_01_1;

public class Class_1 {
	Class_1(){
		b = 4;
		h = 5;
	}
	private int b,h;
		
	public int getBase() {
		return b;
	}
	public int getAltura() {
		return h;
	}
	public void setBase(int b) {
		this.b = b;
	}
	public void setAltura(int h) {
		this.h = h;
	}
	public int Area() {
		return (this.getBase()*this.getAltura())/2;
	}

public static void main(String[] args) {
	Class_1 triangulo = new Class_1();
	
	System.out.println("Área = "+triangulo.Area()+"M²");
}


/*C++

Class Class_1

class Class_1
{
	 int b,h;  //São atributos privados por default
public:
	void getB();
	void getH();
	void setB(int B);
	void setH(int H);
	public int Area();
};
public int getBase() {
		return b;
	}
public int getAltura() {
		return h;
	}
public void setBase(int b) {
		this.b = b;
	}
public void setAltura(int h) {
		this.h = h;
	}
public int Area() {
	return (this.getBase()*this.getAltura())/2;
	}
int main(){

	cout<< "Área = " << triangulo.Area() << "M²" << endl;
}
*/}
