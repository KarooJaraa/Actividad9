package CarpValidador;

public class ValLongitud extends Thread {
    private String contraseña;

    public ValLongitud(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        if (contraseña.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
        } else {
            System.out.println("La contraseña tiene la longitud correcta.");
        }
    }

    public boolean validar(String contraseña2) {
        
        throw new UnsupportedOperationException("Validación no implementada");
    }
}

