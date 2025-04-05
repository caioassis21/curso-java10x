package Desafio1;

public class Desafio01 {
    public static void main(String[] args) {

        /*
         * - Crie um programa que represente tres ninjas da vila da Folha (Konoha)
         * de Naruto e suas respecitivas missões.
         *
         * - Cada ninja tem um nome, uma idade e uma missão atribuida a ele, com o
         * nome da missão, nivel de dificuldade e status de conclusão.
         *
         * */

        // ninja 01
        String nomeNinja01 = "Naruto Uzumaki";
        int idadeNinja01 = 14;
        String missaoNinja01 = "Ir atrás de bandidos";
        char dificuldadeMissaoNinja01 = 'S';


        // ninja 02
        String nomeNinja02 = "Sasuke Uchiha";
        int idadeNinja02 = 16;
        String missaoNinja02 = "Fazer a seguranca do construtor da ponte.";
        char dificuldadeMissaoNinja02 = 'C';


        // ninja 03

        String nomeNinja03 = "Sakura Haruno";
        int idadeNinja03 = 17;
        String missaoNinja03 = "Curar os sobreviventes de Konoha feridos";
        char dificuldadeMissaoNinja03 = 'S';


        // Dados do ninja 01
        System.out.println("\n-----------Ninja 01:-----------");
        System.out.println("Nome: " + nomeNinja01);
        System.out.println("Idade: " + idadeNinja01);
        System.out.println("Missão: " + missaoNinja01);
        System.out.println("Nivel de dificuldade: " +dificuldadeMissaoNinja01);

        if (idadeNinja01 >= 15) {

            System.out.println("Status da missao concluida");

        } else if (idadeNinja01 < 15 && dificuldadeMissaoNinja01 == 'c' || dificuldadeMissaoNinja01 == 'C'
                || dificuldadeMissaoNinja01 == 'd' || dificuldadeMissaoNinja01 == 'D') {

            System.out.println("Status da missao: Concluida");
        } else {
            System.out.println("Status da missao: Nao concluida");
        }

        // Dados do ninja 2
        System.out.println("\n-----------Ninja 02:-----------");
        System.out.println("Nome: " + nomeNinja02);
        System.out.println("Idade: " + idadeNinja02);
        System.out.println("Missão: " + missaoNinja02);
        System.out.println("Nivel de dificuldade: " +dificuldadeMissaoNinja02);

        if (idadeNinja01 >= 15) {

            System.out.println("Status da missao concluida");

        } else if (idadeNinja02 < 15 && dificuldadeMissaoNinja02 == 'c' || dificuldadeMissaoNinja02 == 'C'
                || dificuldadeMissaoNinja02 == 'd' || dificuldadeMissaoNinja02 == 'D') {

            System.out.println("Status da missao: Concluida");
        } else {
            System.out.println("Status da missao: Nao concluida");
        }

        // dados do ninja 03
        System.out.println("\n-----------Ninja 03:-----------");
        System.out.println("Nome: " + nomeNinja03);
        System.out.println("Idade: " + idadeNinja03);
        System.out.println("Missão: " + missaoNinja03);
        System.out.println("Nivel de dificuldade: " +dificuldadeMissaoNinja03);

        if (idadeNinja03 >= 15) {

            System.out.println("Status da missao concluida");

        } else if (idadeNinja03 < 15 && dificuldadeMissaoNinja03 == 'c' || dificuldadeMissaoNinja03 == 'C'
                || dificuldadeMissaoNinja03 == 'd' || dificuldadeMissaoNinja03 == 'D') {

            System.out.println("Status da missao: Concluida");
        } else {
            System.out.println("Status da missao: Nao concluida");
        }
    }
}


