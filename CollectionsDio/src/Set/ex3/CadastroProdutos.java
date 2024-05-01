package Set.ex3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> listaProdutos;

    public CadastroProdutos () {
        this.listaProdutos = new HashSet<>();
    }
    public void adicionarProduto ( long codigo, String nome, double preco, int quantidade ) {
        listaProdutos.add(new Produto( codigo, nome, preco, quantidade ));
    }
    public Set<Produto> exibirProdutoNome(){
        Set<Produto> produtoNomes = new TreeSet<>(listaProdutos);
        return produtoNomes;
    }

    public void exibirProdutoCodigo(){
        for(Produto p : listaProdutos){
            System.out.println(p.getCodigo());
        }
    }
    public Set<Produto> exibirProdutoPreco(){
        Set<Produto> produtoPrecos = new TreeSet<>(new ComparatorPreco());
        produtoPrecos.addAll(listaProdutos);
        return produtoPrecos;
        }

    public static void main ( String[] args ) {
        CadastroProdutos cp = new CadastroProdutos();
        cp.adicionarProduto(1, "Arroz", 10.0, 5);
        cp.adicionarProduto(2, "Feijão", 8.0, 3);
        cp.adicionarProduto(3, "Macarrão", 5.0, 2);
        cp.adicionarProduto(4, "Açúcar", 3.0, 1);
        cp.adicionarProduto(5, "Café", 15.0, 4);
        cp.adicionarProduto(6, "Óleo", 7.0, 2);
        cp.adicionarProduto(7, "Sal", 2.0, 1);
        cp.adicionarProduto(8, "Farinha", 4.0, 3);
        cp.adicionarProduto(9, "Leite", 3.0, 2);
        cp.adicionarProduto(10, "Manteiga", 8.0, 1);

        System.out.println("Produtos ordenados por nome:");
        for(Produto p : cp.exibirProdutoNome()){
            System.out.println(p);
        }

        System.out.println("\nProdutos ordenados por preço:");
        for(Produto p : cp.exibirProdutoPreco()){
            System.out.println(p);
        }

        System.out.println("\nCódigos dos produtos:");
        cp.exibirProdutoCodigo();
    }
}



