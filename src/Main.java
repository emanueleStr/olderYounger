import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeMaisVelha = "";
        int idadeMaisVelha = 0;

        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Dados da pessoa " + i + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner

            if (idade > idadeMaisVelha) {
                nomeMaisVelha = nome;
                idadeMaisVelha = idade;
            }

            if (idade < idadeMaisNova) {
                nomeMaisNova = nome;
                idadeMaisNova = idade;
            }

            System.out.println();
        }

        System.out.println("A pessoa mais velha é: " + nomeMaisVelha + " (" + idadeMaisVelha + " anos)");
        System.out.println("A pessoa mais nova é: " + nomeMaisNova + " (" + idadeMaisNova + " anos)");
    }
}