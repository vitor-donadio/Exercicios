package br.com.bancoomicron.pessoas;

import br.com.bancoomicron.carteiras.CarteiraClientes;
import br.com.bancoomicron.carteiras.IAuditoria;

public class Gerente extends Pessoa implements IAuditoria {
    CarteiraClientes carteira_clientes;
    public Gerente(String cpf, String nome, CarteiraClientes carteira_clientes){
        super(cpf, nome);
        this.carteira_clientes = carteira_clientes;
    }
    public double somaSaldo() {
        double soma = 0.0;
        for (int i = 0; i < this.carteira_clientes.quantidadeContas();){
            Cliente c = this.carteira_clientes.getCliente(i);
            soma += c.somaSaldos();
        }
        return soma;
    }
    public int quantidadeContas() {
        int qnt = 0;
        for(int i = 0;i < this.carteira_clientes.quantidadeContas();i++){
            Cliente c = this.carteira_clientes.getCliente(i);
            qnt += c.numContas();
        }
        return qnt;
    }
}
