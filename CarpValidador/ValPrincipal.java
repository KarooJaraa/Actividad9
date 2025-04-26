package CarpValidador;

public abstract class ValPrincipal{
    protected String password;

    public ValPrincipal(String password) {
        this.password = password;
    }

    public abstract boolean validar();
}
