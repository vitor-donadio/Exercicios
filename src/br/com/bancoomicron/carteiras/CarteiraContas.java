package br.com.bancoomicron.carteiras;

import java.util.ArrayList;
import br.com.bancoomicron.contas.IConta;

public class CarteiraContas implements IAuditoria{
    private ArrayList<IConta> contas;

    public void CarteiraContas(){
        this.contas = new ArrayList<>();
    }
    public int tamanho(){ return this.contas.size(); }
    public int quantidadeContas() { return tamanho(); }
    public double somaSaldo() {
        int soma = 0;
        for (IConta c : this.contas){
            soma += c.getSaldo();
        }
        return soma;
    }
    public void adicionarConta(IConta c){ this.contas.add(c); }
    public boolean removerConta(int numero){
        for(int i = 0; i < this.contas.size();i++){
            IConta c = this.contas.get(i);
            if (c.getNumero() == numero) {
                this.contas.remove(i);
                return true;
            }
        }
        return false;
    }

}
