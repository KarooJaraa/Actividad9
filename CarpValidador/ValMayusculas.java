package CarpValidador;

public class ValMayusculas extends Thread {
    private String contraseña;

    public ValMayusculas (String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void run() {
        int count = 0;
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) count++;
        }
        if (count < 2) {
            System.out.println("Debe tener al menos 2 mayusculas.");
        } else {
            System.out.println("Tiene al menos 2 mayusculas.");
        }
    }

    public boolean validar(String contraseña2) {
        
        throw new UnsupportedOperationException("Validación no implementada");
    }
}