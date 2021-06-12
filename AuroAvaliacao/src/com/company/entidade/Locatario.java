package com.company.entidade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class Locatario {

    private Long id;
    private String nome;
    private Collection<Locacao> locacoes;
    

    public Locatario() {
        
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Collection<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setId(Long _id) {
        this.id = _id;
    }
    public void setNome(String _nome) {
        this.nome = _nome;
    }
    public void setLocacoes(Collection<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public Double divida() {
        // 1. Fazer o calculo de quanto é o valor a pagar por cada locação que ainda não foi paga
        Double totalDivida = 0.0;

        for (Locacao locacaoNaoPaga : this.locacoesNaoPagas()) {
           totalDivida += locacaoNaoPaga.valor();
        }
        // 2. Retornar esse valor total.
        return totalDivida;

    }

    public Boolean ehBomPagador() {
        return this.divida() <= 100.0;
    }

    public void pagar(Locacao $locacao)
            throws IllegalArgumentException, IllegalStateException {

        if (!this.getId().equals($locacao.getLocatario().getId())) {
            throw new IllegalArgumentException("O aluguel não pertence ao locatário.");
        }

        if ($locacao.isPaga()) {
            throw new IllegalArgumentException("O aluguel já está pago.");
        }

        $locacao.setPaga(true);
    }

    public Collection<Locacao> locacoesNaoPagas() {

        Collection<Locacao> locacoesNaoPagas = new ArrayList<>();

        for (Locacao locacao : this.getLocacoes()) {

            if (!locacao.isPaga()) {
                locacoesNaoPagas.add(locacao);
            }
        }

        return locacoesNaoPagas;

    }

    public String categoria(){

        if (this.getLocacoes().size() >= 100){
            return "OURO";
        }
        if (this.getLocacoes().size() >= 50){
            return "PRATA";
        }
        return "BRONZE";
    }


    public void getId(Long $idLocatario) {
    }

    public void put(Long id, Locatario l1) {
    }
}
