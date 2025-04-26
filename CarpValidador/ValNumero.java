package CarpValidador;

public class ValNumero extends Thread {
    private String contraseña;

    public ValNumero(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        if (!contraseña.matches(".*\\d.*")) {
            System.out.println("Debes ponerle al menos un numero.");
        } else {
            System.out.println("Tiene al menos un numero.");
        }
    }

    public boolean validar(String contraseña2) {
        
        throw new UnsupportedOperationException("Validación no implementada");
    }
}
