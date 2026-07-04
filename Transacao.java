package FinancialSystem;

public class Transacao {
    private String tipo;
    private double valor;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public boolean aplicarEm(ContaBancaria conta) {
        if ("deposito".equalsIgnoreCase(tipo)) {
            conta.depositar(valor);
            return true;
        }
        if ("saque".equalsIgnoreCase(tipo)) {
            return conta.sacar(valor);
        }
        System.out.println("Tipo de transação inválido. Use 'deposito' ou 'saque'.");
        return false;
    }
}
