import java.util.Scanner;
import Telefone.AparelhoTelefonico;
import Telefone.ReprodutorMusical;
import Telefone.NavegadorInternet;



public class aparelho{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ligado = true;
        System.out.println("Bem vindo a pagina inicial do seu aparelho");
        System.out.println("-----------------------------------------------");
        
        do {
            System.out.println("Digite o aplicativo que deseja abrir ou aperte em desligar :"); 
            System.out.println("-----");
            System.out.println("Telefone \n-----\n \nReprodutor de musica \n-----\n  \nNavegador de internet \n-----\n \nDesligar");
            String opcao = scanner.nextLine().toUpperCase();
           
            if (opcao.equals("TELEFONE")) {
                AparelhoTelefonico telefone = new AparelhoTelefonico();
                System.out.println("-----------------------------------------------");
                telefone.ligar();
                telefone.atender();
                telefone.iniciarCorreioVoz();
                System.out.println("-----------------------------------------------");
            }
            else if (opcao.equals("REPRODUTOR DE MUSICA")) {
                ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
                System.out.println("-----------------------------------------------");
                reprodutorMusical.tocar();
                reprodutorMusical.pausar();
                reprodutorMusical.selecionarMusica();
                System.out.println("-----------------------------------------------");
            } 
            else if (opcao.equals("NAVEGADOR DE INTERNET")) {
                NavegadorInternet navegadorInternet = new NavegadorInternet();
                System.out.println("-----------------------------------------------");
                navegadorInternet.exibirPagina();
                navegadorInternet.adicionarAba();
                navegadorInternet.atualizarPagina();
                System.out.println("-----------------------------------------------");
            } else if (opcao.equals("DESLIGAR")) {
                System.out.println("-----------------------------------------------");
                System.out.println("Desligando aparelho");
                System.out.println("-----------------------------------------------");
                ligado = false;
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("Opção inválida");
                System.out.println("-----------------------------------------------");
                
            }


        } while (ligado == true);
    }
}