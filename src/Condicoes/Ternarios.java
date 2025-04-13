package Condicoes;

public class Ternarios {

    public static void main(String[] args) {

        /*
         * Ternário: São formas de reduzir o código
         * variavel = (condicao)? ValorSeVerdadeiro: ValorSeFalso;
         * */

        int numeroMissoes = 11;
        String nivelDoNinja = (numeroMissoes >= 10) ? "Esse ninjá esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";

        System.out.println(nivelDoNinja);
    }
}
