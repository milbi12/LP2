import java.util.Scanner;

public class NumeroDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior ou igual a 0: ");
        int numero = scanner.nextInt();

        int contador = 0;

        // Se o número for zero, ele tem um dígito
        if (numero == 0) {
            contador = 1;
        } else {
            // Conta os dígitos enquanto o número não for zero
            while (numero != 0) {
                numero = numero / 10;
                contador++;
            }
        }

        System.out.println("Número de dígitos: " + contador);
    }
}
