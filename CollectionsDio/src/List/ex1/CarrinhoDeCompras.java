package List.ex1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho = new ArrayList<Item>();

    public CarrinhoDeCompras (  ) {
        this.carrinho = new ArrayList<Item>();
    }
    public void adicionarItem ( String nome, int quantidade, double preco ) {
        Item produto = new Item(nome, quantidade, preco);
        carrinho.add(produto);
    }
    public void removerItem (String nomedoproduto){
        List<Item> removerItens = new ArrayList<>();
        for (Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nomedoproduto)){removerItens.add(i);}
        }
        carrinho.removeAll(removerItens);
    }
    public double calcularValorTotal() {
        double valor = 0;
        for (Item i : carrinho) {
            valor += i.getPreco() * i.getQuantidade();
        }
        return valor;
    }
    public void obterItens(){
        System.out.println(carrinho);
    }

    public static void main ( String[] args ) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Arroz", 2, 10.0);
        carrinho.adicionarItem("Feijão", 1, 8.0);
        carrinho.adicionarItem("Macarrão", 3, 5.0);
        carrinho.adicionarItem("Carne", 2, 25.0);
        carrinho.adicionarItem("Cerveja", 12, 2.5);

        carrinho.obterItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());
        carrinho.removerItem("Carne");
        carrinho.obterItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());
        
    }
}
