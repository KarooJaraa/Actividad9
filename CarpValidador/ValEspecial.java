package CarpValidador;

public class ValEspecial extends Thread {
    private String contraseña;

    public ValEspecial(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        if (!contraseña.matches(".@#$*[%^&*(!),.?\":{}|<>].*")) {
            System.out.println("Debe tener al menos un caracter especial.");
        } else {
            System.out.println("Tiene al menos un caracter especial.");
        }
    }

    public boolean validar(String contraseña2) {
        
        throw new UnsupportedOperationException("Validación no implementada");
    }
}