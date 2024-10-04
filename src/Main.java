import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba sus 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Números, cuadrados y cubos:");
        for (int i = 0; i < 20; i++) {
            int numero = numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println("Número " + (i + 1) + ": " + numero + ", Cuadrado: " + cuadrado + ", Cubo: " + cubo);
        }
    }
}
