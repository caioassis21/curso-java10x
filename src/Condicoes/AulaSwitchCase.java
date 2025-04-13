package Condicoes;

import java.util.Scanner;

public class AulaSwitchCase {
    public static void main(String[] args) {

        /*
         * Switch Cases: Que servem para gerar casos especificos
         * Objetivo: Pedir para o usuario escolher entre os ninjas o
         * switch case.
         * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostra opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchira");
        System.out.println("3 - Sakura Haruno");

        // Pede para o usuario escolher uma das opcoes:
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // Reacao ao escolher um usuario
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki, o próximo Hokage.");
                break;

            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchira, o ninja mais revoltado.");
                break;

            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno, a ninja feminina mais legal. ");
                break;

            default:
                System.out.println("Voce não digitou nem uma resposta válida. Tente de novo");
        }


    }
}
