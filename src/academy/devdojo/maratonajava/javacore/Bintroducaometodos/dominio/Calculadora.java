package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumero() {
        System.out.println(10 + 10);
    }

    public void subTraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumero(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumero2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void imprimeDivisaoDeDoisNumero2(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1 / num2);

    }
}
