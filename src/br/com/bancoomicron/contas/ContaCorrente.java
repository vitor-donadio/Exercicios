package br.com.bancoomicron.contas;

public class ContaCorrente implements IConta {
    protected double saldo;
    protected int numero;
    protected int matricula_cliente;

    public ContaCorrente(int numero, int matricula_cliente){
        this.numero = numero;
        this.matricula_cliente = matricula_cliente;
        this.saldo = 0.0;
    }
    public void depositar(double valor){ this.saldo += valor; }
    public boolean sacar(double valor){
        if(valor > this.saldo){
            return false;
        }
        this.saldo -= valor;
        return true;
    }
    public double getSaldo(){ return this.saldo; }
    public int getNumero(){ return this.numero; }
}
