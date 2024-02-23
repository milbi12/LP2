import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo as notas das três provas
        System.out.println("Digite a nota da Prova 1:");
        double prova1 = scanner.nextDouble();

        System.out.println("Digite a nota da Prova 2:");
        double prova2 = scanner.nextDouble();

        System.out.println("Digite a nota da Prova 3:");
        double prova3 = scanner.nextDouble();

        // Calculando a média
        double media = (prova1 + prova2 + prova3) / 3;

        // Verificando se a média é maior ou igual a 7
        if (media >= 7.0) {
            System.out.println("Média: " + media);
            System.out.println("Situação: Aprovado");
        } else {
            // Se não for maior ou igual a 7, pedir a nota da recuperação
            System.out.println("Média: " + media);
            System.out.println("Digite a nota da Recuperação:");
            double recuperacao = scanner.nextDouble();

            // Calculando a nova média
            double mediaFinal = (media + recuperacao) / 2;

            // Verificando se a nova média é maior ou igual a 5
            if (mediaFinal >= 5.0) {
                System.out.println("Média Final: " + mediaFinal);
                System.out.println("Situação: Aprovado após recuperação");
            } else {
                System.out.println("Média Final: " + mediaFinal);
                System.out.println("Situação: Reprovado");
            }
        }

        scanner.close();
    }
}
