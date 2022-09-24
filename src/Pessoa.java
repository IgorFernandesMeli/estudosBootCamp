import org.w3c.dom.ls.LSOutput;

public class Pessoa {
    String nome;
    int idade;
    int id;
    double peso, altura;

   public void calcularIMC() {
       double imc = this.peso/(Math.pow(this.altura, 2));
       if (imc < 20 )  System.out.println("Abaixo do peso");
       if (imc >= 20 && imc <= 25 )  System.out.println("Peso Saudável");
       if (imc > 25 )  System.out.println("Sobrepeso");
    }

    public void ehMaiorIdade() {
        if ((idade < 18)) {
            System.out.println("menor");
        } else {
            System.out.println("menor");
        }
    }

    public Pessoa() {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", id=" + id +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
