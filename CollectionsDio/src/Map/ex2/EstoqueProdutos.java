package Map.ex2;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos ( ) {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adiconarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calculaValorTotal(){
        double valorTotal = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }
    public Produto obterMaisCaro(){
        Produto produtoCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoCaro = p;
                }
            }
        }
        return produtoCaro;
    }
    public Produto obterMaisBarato(){
        Produto produtoBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() < menorPreco){
                    produtoBarato = p;
                }
            }
        }
        return produtoBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidade = null;
        double maiorValorTotal = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()){
                double valorTotal = p.getPreco() * p.getQuantidade();
                if(valorTotal > maiorValorTotal){
                    produtoMaiorQuantidade = p;
                }
            }
        }
        return  produtoMaiorQuantidade;
    }

    public static void main ( String[] args ) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adiconarProduto(1, "Arroz", 10, 5.0);
        estoqueProdutos.adiconarProduto(2, "Feijão", 5, 7.0);
        estoqueProdutos.adiconarProduto(3, "Macarrão", 15, 3.0);
        estoqueProdutos.adiconarProduto(4, "Açucar", 20, 2.0);
        estoqueProdutos.adiconarProduto(5, "Café", 10, 10.0);
        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total: " + estoqueProdutos.calculaValorTotal());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterMaisBarato());
        System.out.println("Produto com maior quantidade e valor total: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
