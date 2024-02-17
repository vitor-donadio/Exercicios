package br.com.bancoomicron.contas;

public class ContaPoupança extends ContaCorrente{
    public ContaPoupança(int numero, int matricula_cliente){
        super(numero, matricula_cliente);
    }
    public void render(double juros){ this.saldo *= juros; }
}
