import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o valor em estoque? ");
        int qtdEstoque = input.nextInt();
        boolean estoqueCritico;
        if (qtdEstoque >= 100) {
            System.out.println("ALTO");
            System.out.println("Precisa repor estoque? " + (estoqueCritico = false));
        } else if (qtdEstoque >= 50) {
            System.out.println("MÉDIO");
            System.out.println("Precisa repor estoque? " + (estoqueCritico = false));
        } else if (qtdEstoque >= 10) {
            System.out.println("BAIXO");
            System.out.println("Precisa repor estoque? " + (estoqueCritico = true));
        } else {
            System.out.println("CRÍTICO");
            System.out.println("Precisa repor estoque? " + (estoqueCritico = true));
        }
    }
}
