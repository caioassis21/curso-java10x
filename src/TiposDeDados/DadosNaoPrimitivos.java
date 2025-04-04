package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Obejtivo da aula: Criar um ninja e atribuir metodos
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // Vai colocar tudo em caixa alta
        System.out.println("Esse texto está normal: " + nome);
        System.out.println("Esse texto está em caixa alta: " + nomeUpperCase);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase(); // Vai colocar tudo em caixa baixa
        System.out.println("nome em caixa baixa: " + aldeiaLowerCase);
    }
}
