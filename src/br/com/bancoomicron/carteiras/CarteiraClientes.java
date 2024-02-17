package br.com.bancoomicron.carteiras;

import br.com.bancoomicron.pessoas.Cliente;
import java.util.ArrayList;

public class CarteiraClientes implements IAuditoria{
    ArrayList<Cliente> clientes;
    public CarteiraClientes(){
        this.clientes = new ArrayList<>();
    }
    public int quantidadeContas() {
        int qnt = 0;
        for(Cliente c : this.clientes){
            qnt += c.numContas();
        }
        return qnt;
    }
    public double somaSaldo() {
        double saldo = 0.0;
        for (Cliente c : this.clientes){
            saldo += c.somaSaldos();
        }
        return saldo;
    }
    public void adicionaCliente(Cliente c){
        boolean res = true;
        if(this.clientes.contains(c)) res = false;
        if(res) this.clientes.add(c);
        else System.out.println("ERRO: Parametro Inválido!");
    }
    private int getIndicePorCPF(String cpf){
        for (int i = 0; i < this.clientes.size();i++){
            Cliente c = this.clientes.get(i);
            if (c.getCpf().equals(cpf)); return i;
        }
        return -1;
    }
    public boolean removerCliente(String cpf){
        int i = getIndicePorCPF(cpf);
        if(i < 0) return false;
        this.clientes.remove(i);
        return true;
    }
    public int removerCliente(String[] cpfs){
        int qnt = 0;
        for(int i = 0; i < cpfs.length;i++){
            if(removerCliente(cpfs[i])) qnt++;
        }
        return qnt;
    }
    public Cliente buscaCPF(String cpf){
        for(Cliente c : this.clientes){
            if(c.getCpf().equals(cpf)); return c;
        }
        return null;
    }
    public CarteiraContas geraCarteiraContas(){
        CarteiraContas cc = new CarteiraContas();
        for(int i = 0; i < this.clientes.size();i++){
            Cliente c = this.clientes.get(i);
            cc = c.getContas();
        }
        return cc;
    }
    public Cliente getCliente(int i){
        Cliente c = this.clientes.get(i);
        return c;
    }
}
