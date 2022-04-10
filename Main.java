package com.company;

import java.lang.reflect.GenericDeclaration;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // "formulas"
        // 1 = pedra, 2 = papel, 3 = tesoura.
        // J1 e C2 = -1 C ganha
        // J1 e C3 = -2 J ganha
        // J2 e C1 = 1 J ganha
        // J2 e C3 = -1 C ganha
        // J3 e C1 = 2 C ganha
        // J3 e C2 = 1 J ganha

        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int numeroJogador;
        int numeroComputador;
        int vitoriasJogador = 0;
        int vitoriasComputador = 0;
        int jogarDeNovo;
        String nomeJogador;

        System.out.println("Olá, digite o seu nome.");
        nomeJogador = leitor.next();
        System.out.println("1 = Pedra, 2 = Papel, 3 = Tesoura.");

        for (int i = 0; i < 3; i++) {
            numeroJogador = leitor.nextInt();
            numeroComputador = gerador.nextInt(3) + 1;

            switch (numeroJogador) {
                case 1 -> System.out.println(nomeJogador + " jogou pedra.");
                case 2 -> System.out.println(nomeJogador + " jogou papel.");
                case 3 -> System.out.println(nomeJogador + " jogou tesoura.");
            }

            switch (numeroComputador) {
                case 1 -> System.out.println("Computador jogou pedra.");
                case 2 -> System.out.println("Computador jogou papel.");
                case 3 -> System.out.println("Computador jogou tesoura.");
            }

            if (numeroJogador == numeroComputador) {
                System.out.println("Empate.");
            } else if ((numeroJogador - numeroComputador) == -2 ||
                    (numeroJogador - numeroComputador) == 1) {
                System.out.println(nomeJogador + " ganhou.");
                vitoriasJogador++;
            } else {
                System.out.println("Computador ganhou.");
                vitoriasComputador++;
            }
        }
        if (vitoriasJogador > vitoriasComputador) {
            System.out.println(nomeJogador + " vencedor do jogo");
        } else if (vitoriasJogador < vitoriasComputador) {
            System.out.println("Computador vencedor do jogo");
        } else {
            System.out.println("o jogo terminou empatado.");
        }

        // final do jogo/repetição

        for (int i = 1; i > 0;) {
            System.out.println("Deseja Jogar novamente? 1 = Sim, 2 = Não.");
            jogarDeNovo = leitor.nextInt();
            if (jogarDeNovo > 1){
                System.out.println("Obrigado por jogar.");
                break;
            }
            if (jogarDeNovo < 2) {


                System.out.println("1 = Pedra, 2 = Papel, 3 = Tesoura.");

                for (int b = 0; b < 3; b++) {
                    numeroJogador = leitor.nextInt();
                    numeroComputador = gerador.nextInt(3) + 1;

                    switch (numeroJogador) {
                        case 1 -> System.out.println(nomeJogador + " jogou pedra.");
                        case 2 -> System.out.println(nomeJogador + " jogou papel.");
                        case 3 -> System.out.println(nomeJogador + " jogou tesoura.");
                    }

                    switch (numeroComputador) {
                        case 1 -> System.out.println("Computador jogou pedra.");
                        case 2 -> System.out.println("Computador jogou papel.");
                        case 3 -> System.out.println("Computador jogou tesoura.");
                    }

                    if (numeroJogador == numeroComputador) {
                        System.out.println("Empate.");
                    } else if ((numeroJogador - numeroComputador) == -2 ||
                            (numeroJogador - numeroComputador) == 1) {
                        System.out.println(nomeJogador + " ganhou.");
                        vitoriasJogador++;
                    } else {
                        System.out.println("Computador ganhou.");
                        vitoriasComputador++;
                    }
                }
                if (vitoriasJogador > vitoriasComputador) {
                    System.out.println(nomeJogador + " vencedor do jogo");
                } else if (vitoriasJogador < vitoriasComputador) {
                    System.out.println("Computador vencedor do jogo");
                } else {
                    System.out.println("o jogo terminou empatado.");
                }
            }
        }

    }
}