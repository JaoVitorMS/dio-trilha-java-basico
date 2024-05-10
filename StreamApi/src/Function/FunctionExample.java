package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main ( String[] args ) {
        //criando uma lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // usando a function com lambda para multiplicar os números por 2
        Function<Integer, Integer> dobrador = ( numero) -> numero * 2;

        //usando a função para dobrar os numeros no Stream e armaenando em uma nova lista
        List<Integer> numerosDobrados = numeros.stream() //criando um stream
                .map(dobrador) //aqui estamos dobrando os números
                .toList(); //convertendo o stream em lista
    }
}
