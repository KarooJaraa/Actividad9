package CarpValidador;

import java.util.regex.*;

public class ValMinusculas extends ValPrincipal {
    public ValMinusculas(String password) {
        super(password);
    }

    @Override
    public boolean validar() {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(password);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count >= 3;
    }
}
