package Questão3;

public class Main {
    public static void main(String[] args) {

        //2.95 e 3.50.
        float banana = 2.95f;
        float morango = 3.50f;

        System.out.println("A banana custa "+ banana + " e o morango custa "+morango);

        float carrinho = morango + banana;
        System.out.println("O total é "+ carrinho);

        double taxaCalculada = carrinho * 0.0825;
        System.out.println("Taxa calculada: "+taxaCalculada);

        double novoCusto = banana + morango + taxaCalculada;
        System.out.println("Novo custo: "+novoCusto);

        boolean muitoCaro = novoCusto > 10;

        System.out.println(muitoCaro);


    }
}