import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double precoOriginal = input.nextDouble();
        double desconto = input.nextDouble();
        if (precoOriginal >= 200) {
            desconto = 0.20;
        } else if (precoOriginal >= 100) {
            desconto = 0.10;
        } else if (precoOriginal >= 50) {
            desconto = 0.05;
        } else {
            desconto = 0;
        }
        double precoFinal = precoOriginal - (precoOriginal * desconto);
        System.out.println("O preço original foi: " + precoOriginal);
        System.out.println("O desconto foi de: " + desconto);
        System.out.println("O preço final foi: " + precoFinal);
    }
}
