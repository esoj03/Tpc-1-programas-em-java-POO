import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        double valorProduto = readDouble("Por favor, insira o valor do salario: ");
        double porcentagemDesconto = readDouble("Qual a porcentagem de aumento?");

        System.out.println("O novo valor do salário será: " + (valorProduto - valorProduto * porcentagemDesconto / 100));
    }

    public static double readDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double value = scanner.nextDouble();
        scanner.nextLine(); // consumir a quebra de linha deixada pelo nextDouble()
        return value;
    }

}
