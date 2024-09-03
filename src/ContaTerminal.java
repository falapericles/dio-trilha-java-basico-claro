import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        int agencia;
        String nome;
        double saldo;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o número da sua conta:");
        numero = leitura.nextInt();
        System.out.println("Digite o número da sua agência:");
        agencia = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Digite o seu nome:");
        nome = leitura.nextLine();
        System.out.println("Digite o seu saldo");
        saldo = leitura.nextDouble();
        System.out.println("Olá "+nome+", obrigado por criar uma conta em"+
                            " nosso banco, sua agência é "+agencia+", conta "+numero+" " +
                            "e seu saldo "+saldo+" já está disponível para saque");
    }
}