package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de dados e Operadores aritméticos.
 */

public class Main {

    public static void main(String[] args) {

        int i;
        //int i; Variáveis não devem ter o mesmo nome.
        int I;
        //int 1a; Não devem começar com números.

        i = 5;
        I = 10;

        final int j = 10;
        //j = 15; final é constante
        int asrn24678nd;
        //int asrn246 78nd; Sem espaços.
        //int asrn2$46%78_md = 10; Não se deve usar caracteres especiais.

        asrn24678nd = 100;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; Não segue boas práticas.
        final int NUMERO_TENTATIVAS = 5;
        //int QUANTIDADE_OPCOES = 25; Não segue boas práticas.

        System.out.println(i);
        System.out.println(I);

        System.out.println(j);
        System.out.println(asrn24678nd);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);





    }
}
