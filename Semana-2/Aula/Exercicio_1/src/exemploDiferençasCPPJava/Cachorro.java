/*
class dog
{
public:
   dog()
   {
      _legs = 4;
      _bark = true;
   }

   void setDogSize(string dogSize)
   {
      _dogSize = dogSize;
   }
   virtual void setEars(string type)      // virtual function
   {
      _earType = type;
   }

private:
   string _dogSize, _earType;
   int _legs;
   bool _bark;

};
*/
package exemploDiferençasCPPJava;

import java.util.Scanner;

public class Cachorro {
//Atributos
	private String tamanho,pelo,orelhas,raca,nome;
	private int patas;
	private boolean latido;
	
//Construtores
	Cachorro(){
		patas = 4;
		latido = true;
		}
//Getters
	public String getTamanho(){
		return tamanho;
	}
	public String getPelo(){
		return pelo;
	}
	public String getOrelhas(){
		return orelhas;
	}
	public String getRaca(){
		return raca;
	}
	public String getNome() {
		return nome;
	}
	int getPatas(){
		return patas;
	}
	boolean getLatido(){
		return latido;
	}
//Setters
	public void setTamaho(String tamanho) {
		this.tamanho = tamanho;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public void setOrelhas(String orelhas) {
		this.orelhas = orelhas;
	}
	public void setRaca(String raca){
		this.raca = raca;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
//Funções
	public void printInfo(){
		
		System.out.println("Informações do cachorro: ");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Raça: "+this.getRaca());
		System.out.println("Tamanho: "+this.getTamanho());
		System.out.println("Tipo das orelhas: "+this.getOrelhas());
		System.out.println("Cor do pelo: "+this.getPelo());
		if(this.getLatido() == true){
			System.out.println("Late bastante: Sim");
		}else {
			System.out.println("Late bastante: Não");
		}
		System.out.println("Número de patas: "+this.getPatas());
	}
	
	
	public static void main(String[] args) {
		String tamanho,pelo,orelhas,raca,nome;
		Scanner sc = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		
		System.out.println("Informe o nome do cachorro:");
		nome = sc.nextLine();
		cachorro.setNome(nome);
		
		System.out.println("Informe o tamanho:");
		tamanho = sc.nextLine();
		cachorro.setTamaho(tamanho);
		
		System.out.println("Informe a cor do pelo:");
		pelo = sc.nextLine();
		cachorro.setPelo(pelo);
		
		System.out.println("Informe o tipo das oelhas:");
		orelhas = sc.nextLine();
		cachorro.setOrelhas(orelhas);
		
		System.out.println("Informe a raça:");
		raca = sc.nextLine();
		cachorro.setRaca(raca);
		
		cachorro.printInfo();
		/*
		System.out.println("Informações do cachorro: ");
		System.out.println("Nome: "+cachorro.getNome());
		System.out.println("Raça: "+cachorro.getRaca());
		System.out.println("Tamanho: "+cachorro.getTamanho());
		System.out.println("Tipo das orelhas: "+cachorro.getOrelhas());
		System.out.println("Cor do pelo: "+cachorro.getPelo());
		if(cachorro.getLatido() == true){
			System.out.println("Late bastante: Sim");
		}else {
			System.out.println("Late bastante: Não");
		}
		System.out.println("Número de patas: "+cachorro.getPatas());
		*/
	}
}

