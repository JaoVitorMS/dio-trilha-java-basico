package Suplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main ( String[] args ) {

//usando o supplier para gerar uma lista de saudações
        Supplier<String> saudacao = () -> "Olá, mundo!";
//gerando uma lista de saudações
        List<String> listaSaudacoes = Stream.generate(
                () -> "Olá!") //gerando saudações

                .limit(10) //limitando a 10 saudações
                .toList(); //convertendo o stream em lista

//imprimindo a lista de saudações
        listaSaudacoes.forEach(System.out::println);
    }
}