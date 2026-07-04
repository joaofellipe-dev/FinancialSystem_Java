package FinancialSystem;

import java.util.Scanner;

public class SistemaFinanceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login(scanner);
        boolean autenticado = login.autenticarUsuario();

        if (!autenticado) {
            System.out.println("Encerrando o sistema. Tente novamente com credenciais válidas.");
            scanner.close();
            return;
        }

        System.out.println("=== Criação de conta bancária ===");
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine().trim();

        double saldoInicial = 0;
        while (true) {
            System.out.print("Digite o saldo inicial (ex: 1500.00): ");
            if (scanner.hasNextDouble()) {
                saldoInicial = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
            System.out.println("Valor inválido. Digite um número válido.");
            scanner.nextLine();
        }

        ContaBancaria conta = new ContaBancaria(saldoInicial, titular);
        MenuPrincipal menu = new MenuPrincipal(conta, scanner);
        menu.exibirMenu();
        scanner.close();
    }
}
