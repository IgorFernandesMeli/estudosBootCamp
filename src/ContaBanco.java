public class ContaBanco implements  Tranzacao{
    private String typeAccount;
    private int saldo = 500;

    public ContaBanco(String typeAccount) {
        setType(typeAccount);
    }

    public static void main(String[] args) {
        System.out.println("deposito em andamento");
    }

    public void getSaldo() {
        System.out.println(this.saldo);
    }

    @Override
    public void tranzacaoOk() {
        System.out.println("tranzacao realizada com sucesso");
    }


    @Override
    public void tranzacaoNaoOk() {
        System.out.println("tranzacao realizada nao realizada");
    }

    public void setType(String type) {
        this.typeAccount = type;
    }

    public void consulta() {
        getSaldo();
    }

    public void pagamento() {
        if (this.typeAccount != "basic") {
           tranzacaoNaoOk();
            System.out.println("pagamento");
        }

        tranzacaoOk();
    }

    public void tranzacao() {
        if (this.typeAccount != "executivo") {
            tranzacaoNaoOk();
        }

        tranzacaoOk();
    }


    @Override
    public String toString() {
        return "ContaBanco{" +
                "typeAccount='" + typeAccount + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
