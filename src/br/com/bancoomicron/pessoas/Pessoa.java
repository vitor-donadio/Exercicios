package br.com.bancoomicron.pessoas;

public abstract class Pessoa {
    protected String cpf;
    protected String nome;
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() { return this.cpf; }

    public String getNome() { return this.nome; }
}
