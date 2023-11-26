package po_01_1;

public class Class_4 {
	private int id;
	private String cpf;
	
	public int getNumero() {
		return id;
	}
	public String getNome() {
		return cpf;
	}
	public void setNumero(int numero) {
		this.id = numero;
	}
	public void setNome(String nome) {
		this.cpf = nome;
	}
 	

}

/*C++

Class Class_4

class Class_4
{
  int id;     //São atributos privados por default
  string cpf;  
public:
  void getId();
  void getCpf();
  void setNumero(int id);
  void setNome(String cpf);
};
*/