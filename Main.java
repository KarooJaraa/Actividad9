import java.util.Scanner;

import CarpValidador.ValEspecial;
import CarpValidador.ValLongitud;
import CarpValidador.ValMayusculas;
import CarpValidador.ValMinusculas;
import CarpValidador.ValNumero;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do{
        System.out.print("Ingrese la contraseña a validar: ");
        String password = scanner.nextLine();

        Thread validador1 = new ValLongitud(password);
        Thread validador2 = new ValEspecial(password);
        Thread validador3 = new ValMayusculas(password);
        Thread validador4 = new ValMinusculas(password);
        Thread validador5 = new ValNumero(password);

        validador1.start();
        validador2.start();
        validador3.start();
        validador4.start();
        validador5.start();

        try {
            validador1.join();
            validador2.join();
            validador3.join();
            validador4.join();
            validador5.join();
        } catch (InterruptedException e) {
            System.out.println("Algo falló con los hilos: " + e.getMessage());
        }

        System.out.print("Validar otra contraseña (si/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } while (respuesta.equals("si"));
}
}
