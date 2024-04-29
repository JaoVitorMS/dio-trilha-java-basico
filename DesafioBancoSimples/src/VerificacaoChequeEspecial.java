import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite o saldo da sua conta: "); 
        double saldo = scanner.nextDouble(); 
        System.out.println("Digite o valor do saque: ");
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 

        System.out.println("Olá bem-vindo ao Banco Digital! Seu saldo é de R$ " + saldo + " e seu limite de cheque especial é de R$ " + limiteChequeEspecial + ".");
        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saque > saldo) {

            // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
            if (saque <= saldo + limiteChequeEspecial) {
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            }
            else {
            System.out.println("Transação nao realizada. Limite do cheque especial excedido.");     
            // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
            }
        }
        else{System.out.println("Transação realizada com sucesso.");}
        

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}