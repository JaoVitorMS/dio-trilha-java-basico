// Crie um programa que receba dois parâmetros e imprima todos os números no intervalo entre eles. Caso o segundo parâmetro seja menor ou igual ao primeiro, o programa deve lançar uma exceção do tipo ParametrosInvalidosException. Esta exceção deve ser tratada no método main. A exceção deve ter a mensagem: "O segundo parâmetro deve ser maior que o primeiro".
import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		boolean valido = false;

		
        while (valido != true) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
                valido = true;
                break;
            
            }catch (ParametrosInvalidosException e) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("O parâmetro dois tem que ser maior "+e);
            }
        }
		
	}
    static void numeroDesejado() throws ParametrosInvalidosException{
        throw new ParametrosInvalidosException();

    }
        
            
        

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
            numeroDesejado();
        }
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i<= contagem; i++){
            System.out.println("Imprimindo o número "+i);
        }
	}
}