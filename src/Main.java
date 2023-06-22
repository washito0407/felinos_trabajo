import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al registro de felinos");
        System.out.println("---------------------------------");

        Scanner scanner = new Scanner(System.in);
        List<String> felinos = new ArrayList<>();

        System.out.println("Por favor, ingrese 5 tipos de felinos:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Felino " + i + ": ");
            String felino = scanner.nextLine();
            felinos.add(felino);
        }

        System.out.println("\nLos felinos ingresados son:");
        for (String felino : felinos) {
            System.out.println(felino);
            System.out.println("Gracias por su tiempo en el registro....");
        }
    }
}
