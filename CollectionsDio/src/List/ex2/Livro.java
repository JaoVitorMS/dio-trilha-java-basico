package List.ex2;

public class Livro {
    public String titulo;
    public String autor;
    public int ano;

    public Livro ( String titulo, String autor, int ano ) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo ( String titulo ) {
        this.titulo = titulo;
    }

    public String getAutor () {
        return autor;
    }

    public void setAutor ( String autor ) {
        this.autor = autor;
    }

    public int getAno () {
        return ano;
    }

    public void setAno ( int ano ) {
        this.ano = ano;
    }

    @Override
    public String toString () {
        return "Livros encontrados: " +
                "titulo:  '" + titulo + '\'' +
                "autor: " + autor + '\'' +
                ", ano:  " + ano;
    }
}
