package Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        while (true) {

            System.out.println("1. Cadastrar\n2. Imprimir");
            int menu = entrada.nextInt();
            if (menu == 2) {
                if (pessoas.size() == 0) {
                    System.out.println("Não existe pessoas cadastradas!");

                } else {
                    for (Pessoa aux : pessoas) {
                        System.out.println(aux.Imprimir());
                    }

                }

            }
            if (menu == 1) {
                System.out.println("1. Pessoa física\n2. Pessoa jurídica");
                int menu2 = entrada.nextInt();
                if (menu2 == 1) {
                    System.out.println("Nome:");
                    String nome = entrada.next();
                    System.out.println("CPF:");
                    String cpf = entrada.next();
                    System.out.println("Data de Nascimento:");
                    int dataNasc = entrada.nextInt();
                    PessoaFisica pf1 = new PessoaFisica(nome, cpf, dataNasc);
                    pessoas.add(pf1);
                }
                if (menu2 == 2) {
                    System.out.println("Nome:");
                    String nome = entrada.next();
                    System.out.println("CNPJ:");
                    String cnpj = entrada.next();
                    System.out.println("Inscrição Estadual:");
                    String incEstadual = entrada.next();
                    System.out.println("Nome Fantasia:");
                    String nomeFantasia = entrada.next();
                    System.out.println("Razão Social:");
                    String razSocial = entrada.next();
                    PessoaJuridica pj1 = new PessoaJuridica(nome, cnpj, incEstadual, nomeFantasia, razSocial);
                    pessoas.add(pj1);
                }

            }

        }
    }
}
