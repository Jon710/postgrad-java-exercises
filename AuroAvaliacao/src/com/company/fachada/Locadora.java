package com.company.fachada;

import com.company.entidade.Locatario;
import com.company.entidade.Locacao;
import com.company.entidade.Veiculo;

import java.security.InvalidParameterException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
   *
   * @author Simone Morello
   */

public class Locadora {

    private static Map<Long, Veiculo>      veiculos   = new HashMap<>();
    private static Map<Long, Locatario>    locatarios = new HashMap<>();
    private static Map<Long, Locacao>      locacoes   = new HashMap<>();

    public static Locacao locar(Long $idLocatario, Long $idVeiculo) {
        // 1. Verificar se o locatário de id respectivo existe e
        //    lançar uma mensagem de erro caso não exista.
        Locatario locatario = locatarios.get($idLocatario);

        if (locatario == null){
            throw new InvalidParameterException("Locatório não existe!");
        }
        // 2. Verificar se o veículo de id respectivo existe e lançar
        //    uma mensagem de erro caso não exista.
        Veiculo veiculo = veiculos.get($idVeiculo);

        if (veiculo == null) {
            throw new InvalidParameterException("Veículo não existe!");
        }
        // 3. Verificar se o veículo já não está locado e lançar uma
        //    mensagem de erro caso esteja.
        if (veiculo.estaLocado()) {
            throw new InvalidParameterException("Veículo já está locado!");
        }
        // 4. Criar uma locação com a data atual como a data de início
        //    a km atual do carro como km de retirada.
        Locacao locacao = new Locacao();
        locacao.setId(locacoes.size() + 1L);
        locacao.setLocatario(locatario);
        locacao.setVeiculo(veiculo);
        locacao.setInicio(new Date());
        locacao.setKmRetirada(veiculo.getKmAtual());
        locatario.getLocacoes().add(locacao);
        veiculo.getLocacoes().add(locacao);
        locacoes.put(locacao.getId(), locacao);

        return locacao;

    }
    public static Locacao devolver(Long $idLocacao, Long $kmDevolucao){
        // 1. Verificar se a locação de locação de id respectivo existe e
        //    lançar uma mensagem de erro caso não exista.
        Locacao l1 = locacoes.get($idLocacao);


        if (l1 == null) {
            throw new InvalidParameterException("Locação não encontrada");
        }

        // 2. Setar a data de fim da locação para a data atual.
        l1.setFim(new Date());
        System.out.println(l1.getFim());

        // 3. Setar a km de entrega da locação.
        l1.setKmDevolucao($kmDevolucao);

        // 4. Setar que a locação ainda não foi paga.
        l1.setPaga(false);

        // 5. Atualizar a km atual do veículo.

        l1.getVeiculo().setKmAtual($kmDevolucao);
        System.out.println(l1.getVeiculo().getMarca() + " " + l1.getVeiculo().getKmAtual());

        return l1;

    }
    public static void instanciarObjetos() throws ParseException{

        Veiculo v1 = new Veiculo();
        v1.setId(1L);
        v1.setMarca("Fiat");
        v1.setValorDiaria(100.0);
        v1.setValorKmAdicional(5.0);
        v1.setKmAtual(0L);
        v1.setLocacoes(new ArrayList<>());
        veiculos.put(v1.getId(), v1);

        Locatario l1 = new Locatario();
        l1.setId(1L);
        l1.setNome("Jorge");
        l1.setLocacoes(new ArrayList<>());
        locatarios.put(l1.getId(), l1);
    }
}
