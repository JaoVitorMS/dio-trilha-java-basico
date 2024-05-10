package Predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main ( String[] args ) {
        //criando uma lista de palavras
        List<String> palavras = List.of("Java", "Kotlin", "JavaScript", "C#", "Python", "Ruby", "Go", "Swift", "Rust", "Cobol");

        //criando um predicate que verifica se a palavra tem mais de 4 letras
        Predicate<String> maisDeQuatroLetras = ( palavra) -> palavra.length() >= 4;

        //usando o stream para filtrar as palavras que tem mais de 4 letras
        //imprimindo as palavras que tem mais de 4 letras
        palavras.stream()//isso permite criar um stream
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test ( String s ) {
                        return s.length() >= 4;
                    }
                }) //aqui estamos filtrando as palavras
                .forEach(System.out::println);


//                .filter(maisDeQuatroLetras) //aqui estamos filtrando as palavras
//                .forEach(System.out::println); //aqui estamos imprimindo as palavras
    }
}
