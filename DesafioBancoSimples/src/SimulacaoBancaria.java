import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        System.out.println("Bem-vindo! escolha uma das opções abaixo:");
        while (true) { 
            System.out.println(" 1-Depositar \n 2-Sacar \n 3-Consultar Saldo \n 0-Encerrar");
            int opcao = scanner.nextInt(); 
            
            switch (opcao) {
                case 1:
                    System.out.println("Quanto você gostaria de depositar: ");
                    saldo = scanner.nextDouble();
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 2:
                    System.out.println("Quanto você gostaria de sacar: ");
                    double sacar = scanner.nextDouble();
                    if (sacar > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }else{
                    saldo = saldo - sacar;
                    System.out.println("Saldo atual: "+saldo);}
                    break;
                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;                
                case 0:
                    System.out.println("Programa encerrado.");
                    break;                
               // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            if (opcao == 0) {    
                break;
            }
         }
         scanner.close();
    }
}
