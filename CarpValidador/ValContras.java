package CarpValidador;
import java.util.Scanner;

public class ValContras {

    static class HiloValidador implements Runnable {
        private String password;

        public HiloValidador(String password) {
            this.password = password;
        }

        @Override
        public void run() {
            boolean valida = true;

            ValLongitud v1 = new ValLongitud(password);
            if (!v1.validar()) {
                System.out.println(" Error: longitud mínima no válida.");
                valida = false;
            }

            ValMayusculas v2 = new ValMayusculas(password);
            if (!v2.validar()) {
                System.out.println(" Error: faltan mayúsculas.");
                valida = false;
            }

            ValMinusculas v3 = new ValMinusculas(password);
            if (!v3.validar()) {
                System.out.println(" Error: faltan minúsculas.");
                valida = false;
            }
            
            ValNumero v4 = new ValNumero(password);
            if (!v4.validar()) {
                System.out.println(" Error: falta un número.");
                valida = false;
            }

            ValEspecial v5 = new ValEspecial(password);
            if (!v5.validar()) {
                System.out.println(" Error: falta un carácter especial.");
                valida = false;
            }

            System.out.println("Contraseña: " + password);
            if (valida) {
                System.out.println(" Contraseña válida.");
            } else {
                System.out.println(" Contraseña inválida.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese contraseñas (escriba 'salir' para terminar):");

        while (true) {
            System.out.print("Contraseña: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) break;

            Thread hilo = new Thread(new HiloValidador(input));
            hilo.start();
        }

        System.out.println("Programa finalizado.");
    }
}
