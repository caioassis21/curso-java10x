package Condicoes;

public class IfElse {
    public static void main(String[] args) {


        /*
         * IF e ELSE - Condições
         * Objetivo: Passar um ninja de nivel de acordo com o numero de missoes
         **/

        // Ninja Naruto
        String nome = "Naruto";
        String ranking;

        int idade = 20;
        boolean hokage = false;
        short numeroMissoes = 10;

        if (numeroMissoes >= 10 && idade > 15) {
            System.out.println("Ranking: Chunnin");
        } else if (numeroMissoes >= 20) {
            System.out.println("Ranking: Jounin");

        } else {
            System.out.println("Ranking: Genin");
        }


    }
}
