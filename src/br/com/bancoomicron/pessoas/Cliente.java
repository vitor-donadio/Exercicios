package br.com.bancoomicron.pessoas;

import br.com.bancoomicron.carteiras.CarteiraContas;
import br.com.bancoomicron.contas.IConta;

public class Cliente extends Pessoa{
    private CarteiraContas contas;
    private int matricula;
    public static int gerador_matricula = 0;
    public Cliente(String cpf, String nome){
        super(cpf, nome);
        this.contas = new CarteiraContas();
        this.matricula = geraMatricula();
    }
    public Cliente(String cpf, String nome, IConta conta){
        super(cpf, nome);
        this.contas = new CarteiraContas();
        this.matricula = geraMatricula();
        this.contas.adicionarConta(conta);
    }
    public double somaSaldos(){
        return this.contas.somaSaldo();
    }
    public int numContas(){
        return this.contas.tamanho();
    }
    public int getMatricula(){
        return this.matricula;
    }
    public CarteiraContas getContas(){
        return this.contas;
    }
    public void adicionarContas(IConta c){
        this.contas.adicionarConta(c);
    }
    public boolean removerContas(int numero_conta){
        return this.contas.removerConta(numero_conta);
    }
    public static int geraMatricula(){
        Cliente.gerador_matricula += 1;
        return Cliente.gerador_matricula;
    }
}
