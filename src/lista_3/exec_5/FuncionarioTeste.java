package lista_3.exec_5;

public class FuncionarioTeste {

    public static boolean testeDeposita(){
        double deposito = 4;
        Conta conta = new Conta();
        conta.deposita(deposito);
        return conta.pegaSaldo() == deposito;
    }

    public static boolean testeSaca(){
        Conta conta = new Conta();
        conta.deposita(500);
        if (conta.saca(600))
            return conta.pegaSaldo() == 0;
        else
            return !conta.saca(600);
    }

    public static void main(String [] args) {
        boolean passou;
        System.out.println("Teste depositar: ");
        passou = FuncionarioTeste.testeDeposita();
        if (passou)
            System.out.println("Passou");
        else
            System.out.println("Falhou");
        System.out.println("Teste sacar: ");
        passou = FuncionarioTeste.testeSaca();
        if (passou)
            System.out.println("Passou");
        else
            System.out.println("Falhou");
    }
}

