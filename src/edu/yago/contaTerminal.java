package edu.yago;

import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, por favor informe o seu nome: ");
        String name = scanner.next();
        System.out.println("Por favor, digite o número de sua agência! ");
        String agencia = scanner.next();
        System.out.println("O seu usuário: ");
        int usuario = Integer.parseInt(scanner.next());
        double saldo = 237.48;

        String dados = dados1(name, agencia, usuario, saldo);
        System.out.println(dados);
    };

    public static String dados1(String name, String agencia, int usuario, double saldo ) {
        return "Olá " + name.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia + ", conta ")
                .concat(String.valueOf(usuario) + " e seu saldo ")
                .concat(saldo + " já está disponível para saque." );
    };

};