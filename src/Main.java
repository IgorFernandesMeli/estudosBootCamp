public class Main {
    public static void main(String[] args) {
        Pessoa individuo1 = new Pessoa();

        Pessoa dadospessoal = new Pessoa("roberto", 34 , 3578);

        Pessoa caracteristicas = new Pessoa(74.75,1.75);


        System.out.println(dadospessoal.toString());

    }
}