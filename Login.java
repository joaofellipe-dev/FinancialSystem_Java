package FinancialSystem;
import java.util.Scanner;

public class Login {
    private Scanner scanner;
    private final String loginValido = "usuario";
    private final String senhaValida = "senha123";

    public Login(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean autenticarUsuario() {
        System.out.println("=== Sistema Financeiro ===");
        System.out.print("Digite o login: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (login.equals(loginValido) && senha.equals(senhaValida)) {
            System.out.println("Autenticação bem-sucedida!");
            return true;
        }

        System.out.println("Login ou senha incorretos. Acesso negado.");
        return false;
    }
}
