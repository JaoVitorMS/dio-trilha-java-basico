package Telefone;
public class NavegadorInternet implements ConexaoInternet{
     @Override
    public void conectar() {
        System.out.println("Conectado a internet");
    }

    public static void exibirPagina(){
        System.out.println("Exibindo página");
    }
    public static void adicionarAba(){
        int abas = 0;
        System.out.println("Adicionando aba");
        abas++;
        System.out.println("Abas abertas: " + abas);
    }
    public static void atualizarPagina(){
        System.out.println("Atualizando página");
        for(int i = 0; i<=3; i++){
            System.out.println("Atualizando... ");
        }
        System.out.println("Página atualizada");
    }
    
}
