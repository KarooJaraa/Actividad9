package CarpValidador;

import java.util.regex.*;

public class ValMayusculas extends ValPrincipal {
    public ValMayusculas(String password) {
        super(password);
    }

    @Override
    public boolean validar() {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(password);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count >= 2;
    }
}
