package lista_3.exec_5;

public class Conta {
    private int saldo;
    public void deposita(double deposito){
        this.saldo += deposito;
    }
    public double pegaSaldo(){
        return this.saldo;
    }
    public boolean saca(double saque){
        if ( saque <= this.saldo) {
            this.saldo -= saque;
            return true;
        }
        return false;
    }
}