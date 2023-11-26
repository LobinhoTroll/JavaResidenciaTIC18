package po_01_1;

public class Class_3 {
	private String nome,senha;
		
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
	
/*C++

Class Class_3

class Class_3
{
	 string nome,senha;  //São atributos privados por default
public:
	 void getNome();
	 void getSenha();
	 void setNome(String nome);
	 void setSenha(String senha);
	};
*/