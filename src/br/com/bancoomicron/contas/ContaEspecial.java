package br.com.bancoomicron.contas;

public class ContaEspecial extends ContaCorrente{
    private double cheque_especial;
    private double taxa_iof = 0.03;
    public ContaEspecial(int numero, int matricula_cliente, double cheque_especial){
        super(numero, matricula_cliente);
        this.cheque_especial = cheque_especial;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else if (this.cheque_especial >= (valor - this.saldo)*this.taxa_iof) {
            this.saldo = 0.0;
            this.cheque_especial -= (valor - this.saldo)*this.taxa_iof;
            return true;
        }
        return false;
    }
}
