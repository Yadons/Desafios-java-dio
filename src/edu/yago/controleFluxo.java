package edu.yago;
import java.util.Scanner;


public class controleFluxo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro número: ");
        int valor1 = Integer.parseInt(terminal.next());
        System.out.println("Informe o valor do segundo número: ");
        int valor2 = Integer.parseInt(terminal.next());

        try {
                contar(valor1, valor2);
        } catch (parametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro!!");
        };

    };

    static void contar(int valor1, int valor2)  throws parametrosInvalidosException{
        if (valor1 > valor2) {
            throw new parametrosInvalidosException(); // Acionando após a condição.
        } else {
            int contagem = valor2 - valor1;
            for(int x = 1; x <= contagem; x++) {
                System.out.println("Imprimindo o número " + x + ".");
            };
        };


    };
};
