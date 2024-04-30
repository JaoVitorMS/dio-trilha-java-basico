package List.ex2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros = new ArrayList<>();

    public SomaNumeros ( ) {
        this.numeros = new ArrayList<Integer>();
    }

    public List<Integer> getNumeros () {
        return numeros;
    }

    public void setNumeros ( List<Integer> numeros ) {
        this.numeros = numeros;
    }

    @Override
    public String toString () {
        return "Os numeros da lista são: "+numeros;
    }

    public void adicionarNumero ( int numero ) {
        numeros.add(numero);
    }
    public void calcularSoma(){
        int soma = 0;
        for (int numbers : numeros){
            soma += numbers;
        }
        System.out.println("A soma dos numeros é: "+soma);
    }

    public void encontrarMaior(){
        int maior = 0;
        for (int numbers : numeros){
            if (numbers > maior){
                maior = numbers;
            }
        }
        System.out.println("O maior numero é: "+maior);
    }
    public void encontrarMenor(){
        int menor = numeros.getFirst();
        for (int numbers : numeros){
            if (numbers < menor){
                menor = numbers;
            }
        }
        System.out.println("O menor numero é: "+menor);
    }
    public void exibirNumeros(){
        System.out.println(numeros);
    }

    public static void main ( String[] args ) {
        SomaNumeros listinha = new SomaNumeros();
        listinha.adicionarNumero(1356);
        listinha.adicionarNumero(2);
        listinha.adicionarNumero(3);
        listinha.adicionarNumero(4);
        listinha.adicionarNumero(5);
        listinha.adicionarNumero(6);
        listinha.adicionarNumero(7);
        listinha.adicionarNumero(8);
        listinha.adicionarNumero(9);
        listinha.adicionarNumero(10);

        listinha.calcularSoma();
        listinha.encontrarMaior();
        listinha.encontrarMenor();
        listinha.exibirNumeros();
    }
}
