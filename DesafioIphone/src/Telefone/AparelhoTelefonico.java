package Telefone;
public class AparelhoTelefonico implements ConexaoInternet {

    @Override
    public void conectar() {
        System.out.println("Creditos celulares indentificados");
    }

    public static void ligar(){
        System.out.println("Ligando...");
    }
    
    public static void atender(){
        System.out.println("Atendendo...");
    }

    public static void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }
}
