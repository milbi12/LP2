import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário a quantidade de livros
        System.out.print("Digite a quantidade de livros que deseja comprar: ");
        int quantidadeLivros = scanner.nextInt();

        // Calcular o valor total para o critério A
        double valorTotalA = 0.25 * quantidadeLivros + 7.50;

        // Calcular o valor total para o critério B
        double valorTotalB = 0.50 * quantidadeLivros + 2.50;

        // Determinar qual é a melhor opção de desconto
        String melhorOpcao;
        if (valorTotalA < valorTotalB) {
            melhorOpcao = "Critério A";
        } else if (valorTotalB < valorTotalA) {
            melhorOpcao = "Critério B";
        } else {
            melhorOpcao = "Ambos os critérios têm o mesmo valor total";
        }

        // Exibir a melhor opção de desconto para o usuário
        System.out.println("A melhor opção de desconto é: " + melhorOpcao);

        scanner.close();
    }
}
