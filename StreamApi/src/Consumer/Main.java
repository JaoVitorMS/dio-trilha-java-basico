package Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7, 8, 9, 10);

        public Main ( List<Integer> listaNumeros ) {
            this.listaNumeros = listaNumeros;
        }

        //consumer
        Consumer<Integer> numerosPares = (numero) -> {
    if (numero % 2 == 0) {
        System.out.println(numero);
    }
    listaNumeros.stream().forEach(new Consumer<Integer>() {
        @Override
        public void accept ( Integer integer ) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }); // This is where the missing parenthesis should be
};












}