# Exercício 3

Herança em Java é a capacidade de uma subclasse de ter acesso as propriedades da superclasse(também chamada classe base) relacionada a esta subclasse. Dessa forma os atributos e métodos de uma classe são propagados de cima para baixo em um padrão hierárquico.

## Exemplo de contrução de subclasses(créditos https://www.guj.com.br/t/superclasse-e-subclasse/85381/3)

//Superclasse
Public class Animais {

      private final String sexo; //poderia ser char ou boolean

      public Animais (String sexo) {
            this.sexo=sexo;
      }

      public String getSexo() {
            return sexo;
      }
}

Ao criar a subclasse é necessário colocar o "extends" e a classe mais alta na hierarquia a qual ela se relacionará.

//Subclasse
Public class Terrestre extends Animais {

      private String alimento;

      public Terrestre (String sexo, String alimento) {
            super(sexo);//passa parâmetro para o construtor da superclasse 
            this.alimento=alimento;
      }

      public void setAlimento(String alimento) {
            this.alimento=alimento;          
      }

      public String getAlimento() {
            return alimento;        
      }
      
}

No C++ a sintáxe é diferente sendo ela:

class Empregado {
    
    string apelido;

    int departamento;
    
    public:
    Empregado(const string &n, int d);
    void imprime() const;
}

class Gestor: public Empregado {
    
    int nivel;
    
    public:
    Gestor(const string &n, int d, int nv);
    void imprime() const;
}

Empregado sendo a SuperClasse e gestor a SubClasse e a sintaxe SubClasse: Superclasse {métodos e atributos}.