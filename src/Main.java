public class Main {
    public static void main(String[] args) {
        ContaBanco basico = new ContaBanco("basico");
        ContaBanco executivo = new ContaBanco("executivo");
        ContaBanco colaborador = new ContaBanco("colaborador");

        basico.tranzacao();
        basico.consulta();
        basico.pagamento();
        basico.toString();

        executivo.tranzacao();
        executivo.consulta();
        executivo.pagamento();
        executivo.toString();

        colaborador.tranzacao();
        colaborador.consulta();
        colaborador.pagamento();
        colaborador.toString();

    }
}