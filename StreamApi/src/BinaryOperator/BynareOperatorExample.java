package BinaryOperator;

import java.util.List;
import java.util.function.BinaryOperator;

public class BynareOperatorExample {
    public static void main ( String[] args ) {
        //criando uma lista de inteiros
    List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    //usando o binary operator com lambda para somar os números
    BinaryOperator<Integer> somar = ( numero1, numero2) -> numero1 + numero2;

    //usando o binary operator para somar os números no Stream
    int soma = numeros.stream() //criando um stream
         //   .reduce(0, somar); //aqui estamos somando os números
            .reduce(0, new BinaryOperator<Integer>() {
                @Override
                public Integer apply ( Integer integer, Integer integer2 ) {
                    return integer + integer2;
                }
            }); // This is where the missing parenthesis should be


    //imprimindo a soma
    System.out.println(soma);
    }
}
