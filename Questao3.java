import java.util.Scanner;

public class SomaDiferencaIntervalos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir os intervalos de tempo
        System.out.println("Insira o primeiro intervalo de tempo (horas minutos segundos):");
        int horas1 = scanner.nextInt();
        int minutos1 = scanner.nextInt();
        int segundos1 = scanner.nextInt();

        System.out.println("Insira o segundo intervalo de tempo (horas minutos segundos):");
        int horas2 = scanner.nextInt();
        int minutos2 = scanner.nextInt();
        int segundos2 = scanner.nextInt();

        // Calcular a soma dos intervalos
        int somaHoras = horas1 + horas2;
        int somaMinutos = minutos1 + minutos2;
        int somaSegundos = segundos1 + segundos2;

        // Verificar se a soma dos segundos ultrapassou 59 e ajustar os minutos e segundos
        if (somaSegundos >= 60) {
            somaSegundos -= 60;
            somaMinutos++;
        }

        // Verificar se a soma dos minutos ultrapassou 59 e ajustar as horas e minutos
        if (somaMinutos >= 60) {
            somaMinutos -= 60;
            somaHoras++;
        }

        // Calcular a diferença dos intervalos
        int diferencaHoras = Math.abs(horas1 - horas2);
        int diferencaMinutos = Math.abs(minutos1 - minutos2);
        int diferencaSegundos = Math.abs(segundos1 - segundos2);

        // Exibir os resultados
        System.out.println("Soma dos intervalos: " + somaHoras + " horas, " + somaMinutos + " minutos, " + somaSegundos + " segundos");
        System.out.println("Diferença dos intervalos: " + diferencaHoras + " horas, " + diferencaMinutos + " minutos, " + diferencaSegundos + " segundos");

        scanner.close();
    }
}
