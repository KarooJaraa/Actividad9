package CarpValidador;

import java.util.regex.*;

public class ValNumero extends ValPrincipal {
    public ValNumero(String password) {
        super(password);
    }

    @Override
    public boolean validar() {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

