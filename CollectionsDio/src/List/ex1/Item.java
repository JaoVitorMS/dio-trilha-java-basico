package List.ex1;

public class Item {
    public String nome;
    public int quantidade;
    public double preco;

    public Item ( String nome, int quantidade, double preco ) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public int getQuantidade () {
        return quantidade;
    }

    public void setQuantidade ( int quantidade ) {
        this.quantidade = quantidade;
    }

    public double getPreco () {
        return preco;
    }

    public void setPreco ( double preco ) {
        this.preco = preco;
    }

    @Override
    public String toString () {
        return "nome = " +nome + ", preço: "+ preco + ", quantidade: " + quantidade;
    }
}
