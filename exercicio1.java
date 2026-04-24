import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do produto desejado: ");
        String nomeProduto = input.next();
        System.out.print("Digite o preço do produto desejado: ");
        Double preco = input.nextDouble();
        System.out.print("Digite a quantidade de produtos que têm em estoque: ");
        int qtdProduto = input.nextInt();
        System.out.print("Digite a categoria do produto: ");
        String categoria = input.next();
        System.out.print("Esse produto ainda está ativo? ");
        boolean ativo = input.nextBoolean();
        System.out.println("O nome do seu produto é " + nomeProduto.toUpperCase());
        System.out.println("A quantidade de caracteres são " + nomeProduto.length());
        System.out.println("O preço do seu produto é: " + preco);
        System.out.println("A quantidade em estoque desse produto é: " + qtdProduto);
        System.out.println("A categoria do seu produto é: " + categoria);
        System.out.println("O produto ainda está ativo? " + ativo);

        if (nomeProduto != null) {
            System.out.println("Dados inválidos");
        } else {
            System.out.println("Dados válidos");
        }
    }
}