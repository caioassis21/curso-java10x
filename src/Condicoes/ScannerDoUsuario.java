package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
         * Scannner é uma forma de trazer o usuario para dentro da aplicacao
         * Objetivo: O usuario vai criar um ninja e nós vamos validar os dados.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do ninja: ");
        String nomeDoNinja = scanner.nextLine();

        System.out.println("O nome do ninja é " + nomeDoNinja);

        System.out.print("Escreva a idade do ninja: ");
        int idade = scanner.nextInt();

        System.out.println("A idade da " + nomeDoNinja + " é " + idade + " anos.");

        // Tratamento de dados
        if (idade >= 18) {
            System.out.println("Esse ninja é maior de idade. Ele já pode fazer missoes fora da aldeia");
        } else {
            System.out.println("Esse ninja é menor de idade. Ele é novo demais para sair da vila");
        }


        scanner.close();
    }
}
