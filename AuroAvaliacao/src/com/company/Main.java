package com.company;

import com.company.entidade.Locacao;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import static com.company.fachada.Locadora.*;


public class Main {


    public static void main(String[] args) throws ParseException {

        instanciarObjetos();

        Long idLocatario = 1L;
        Long idVeiculo = 1L;

        Locacao l1 = locar(idLocatario, idVeiculo);

        System.out.println(l1);

        Long kmDevolucao = 100L;
        Long idLocacao = 1L;

//        quanto L1 como L2 são o mesmo objeto Locacao em memoria ram

         Locacao l2 = devolver( idLocacao,  kmDevolucao);

        System.out.println(l2);
    }


}
