package FinancialSystem;

public class Autenticacao {
    private String login;
    private String senha;
    private boolean autenticado;

    public Autenticacao(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.autenticado = false;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public boolean isAutenticado() {
        return autenticado;
    }
    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
}
