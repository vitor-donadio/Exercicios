package br.com.bancoomicron.pessoas;

import br.com.bancoomicron.carteiras.IAuditoria;

public class Auditor extends Pessoa{
    public Auditor(String cpf, String nome){
        super(cpf, nome);
    }
    public boolean auditar(IAuditoria auditado){
        if(auditado.somaSaldo() / auditado.quantidadeContas() >= 1000) return true;
        return false;
    }
}
