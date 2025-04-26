package CarpValidador;

public class ValLongitud extends ValPrincipal {
    public ValLongitud(String password) {
        super(password);
    }

    @Override
    public boolean validar() {
        return password.length() >= 8;
    }
}
