package List.ex2;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo = new ArrayList<Livro>();

    public CatalogoLivros ( ) {
        this.catalogo = new ArrayList<Livro>();
    }
    public void adicionarLivro(String nome, String autor, int ano){
        Livro livros = new Livro(nome, autor, ano);
        catalogo.add(livros);
    }
    public void pesquisarAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        if(!catalogo.isEmpty()){
                for(Livro Autor : catalogo){
                    if(Autor.getAutor().equalsIgnoreCase(autor)){
                        livrosAutor.add(Autor);
                        }
                    }
                }
        System.out.println(livrosAutor);
    }
        public void pesquisarIntervaloAno(int ano1, int ano2){
            List<Livro> livrosAno = new ArrayList<>();
            if(!catalogo.isEmpty()){
                for(Livro Ano : catalogo){
                    if(Ano.getAno() >= ano1 && Ano.getAno() <= ano2){
                        livrosAno.add(Ano);
                    }
                }
            }
            System.out.println(livrosAno);
        }
        public void PesquisarTitulo(String titulo){
            List<Livro> byTitulo = new ArrayList<>();
            if(!catalogo.isEmpty()){
                for(Livro titulos : catalogo){
                    if (titulos.getTitulo().equalsIgnoreCase(titulo)){
                        byTitulo.add(titulos);
                    }
                }
            }
            System.out.println(byTitulo);
    }

    public static void main ( String[] args ) {
        CatalogoLivros escolha = new CatalogoLivros();
        escolha.adicionarLivro("A Metafisica dos Costumes", "E.Kant", 1797);
        escolha.adicionarLivro("A Riqueza das Nações", "A. Smith", 1776);
        escolha.adicionarLivro("Retórica", "Aristóteles", 1322);
        escolha.adicionarLivro("A Divina Comedia", "Dante A.", 1314);
        escolha.adicionarLivro("O Jardim das Aflições", "Olavo de Carvalho", 1995);
        escolha.adicionarLivro("O Imbecil Coletivo", "Olavo de Carvalho", 2000);

        escolha.pesquisarAutor("Aristóteles");
        escolha.pesquisarIntervaloAno(1995, 2000);
        escolha.PesquisarTitulo("A Divina Comedia");
    }
}
