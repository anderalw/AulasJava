package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumero(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumero2(20,0));
        System.out.println("-------");
        calculadora.imprimeDivisaoDeDoisNumero2(86,0);
    }
}
