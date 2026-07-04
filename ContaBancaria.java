package FinancialSystem;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldoInicial, String titular) {
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }

    public void exibirSaldo() {
        System.out.println("Saldo da conta de " + titular + ": R$ " + String.format("%.2f", saldo));
    }
}
