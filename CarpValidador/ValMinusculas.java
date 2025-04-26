package CarpValidador;

public class ValMinusculas extends Thread {
    private String contraseña;

    public ValMinusculas(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        int count = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) count++;
        }
        if (count < 3) {
            System.out.println("Debe tener al menos 3 minusculas.");
        } else {
            System.out.println("Tiene suficientes minusculas.");
        }
    }

    public boolean validar(String contraseña2) {
        
        throw new UnsupportedOperationException("Validación no implementada");
    }
}
