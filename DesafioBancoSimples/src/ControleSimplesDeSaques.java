import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Bem-vindo ao Banco Digital!");
        System.out.println("Digite o valor do seu limite diario: ");
        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
        for(double verificador = 0; verificador <= limiteDiario; verificador++){
// TODO: Solicite ao usuário o valor do saque:
           System.out.println("Digite o valor do saque: ");
           double saque = scanner.nextDouble();
           // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            if (saque == 0.0) {
                System.out.println("Transacoes encerradas.");
                break;
            }
// Dica: Utilize um 'if/else' parva erificar as condições do valorSaque e o limiteDiario;
            else if ( saque >= verificador + 1) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
           
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
// TODO: Informe que o saque foi realizado e mostre o limite restante:
            else{
                limiteDiario = limiteDiario - saque; 
                System.out.println("Saque realizado. Limite restante: " +limiteDiario);
                System.out.println("Transacoes encerradas.");
                break;
            }

              
        }
        scanner.close(); 
    }

// Fechamos o Scanner para evitar vazamento de recursos:
}

