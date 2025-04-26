package CarpValidador;

import java.util.regex.*;

public class ValEspecial extends ValPrincipal{
    public ValEspecial(String password) {
        super(password);
    }

    @Override
    public boolean validar() {
        Pattern pattern = Pattern.compile("[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

