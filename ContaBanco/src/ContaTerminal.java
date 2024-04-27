import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome, agencia;
        int numero;
        double saldo;

        System.out.println("Por favor, digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da Conta: ");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
