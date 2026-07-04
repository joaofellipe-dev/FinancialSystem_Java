package FinancialSystem;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;
    private ContaBancaria conta;

    public MenuPrincipal(ContaBancaria conta, Scanner scanner) {
        this.scanner = scanner;
        this.conta = conta;
    }

    public void exibirMenu() {
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Saldo da Conta Bancária");
            System.out.println("2. Realizar Transação");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número.");
                scanner.nextLine();
                continue;
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    conta.exibirSaldo();
                    break;
                case 2:
                    realizarTransacao();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void realizarTransacao() {
        System.out.println("=== Realizar Transação ===");
        System.out.print("Digite o tipo de transação (deposito/saque): ");
        String tipo = scanner.nextLine().trim();

        System.out.print("Digite o valor: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Valor inválido.");
            scanner.nextLine();
            return;
        }

        double valor = scanner.nextDouble();
        scanner.nextLine();

        Transacao transacao = new Transacao(tipo, valor);
        if (!transacao.aplicarEm(conta)) {
            if (!"deposito".equalsIgnoreCase(tipo) && !"saque".equalsIgnoreCase(tipo)) {
                System.out.println("Transação não executada. Tipo inválido.");
            }
        }
    }
}
