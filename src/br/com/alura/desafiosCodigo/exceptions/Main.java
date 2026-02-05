package br.com.alura.desafiosCodigo.exceptions;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n1: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("n2: ");
        int b = Integer.parseInt(sc.nextLine());

        try {
            int divisao = a / b;
            System.out.println("Resultado: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Divisão não permitida! Código de erro: {" + e.getMessage() + "}");
        }
        System.out.println("Usuário: ");
        String user = sc.nextLine();
        System.out.println("Senha: ");
        String password = sc.nextLine();

        try {
            validaSenha(password);
            System.out.println("Cadastrado com sucesso");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
        sc.close();
    }

    public static void validaSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("Número de caracteres na senha é menor que Oito, não sendo permitido pelo sistema!");
        }
    }
}
