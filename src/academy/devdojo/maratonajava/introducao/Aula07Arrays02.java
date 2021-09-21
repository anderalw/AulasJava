package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    // byte, short, int, long, flloat e double 0
    // char '\u0000'  ' '
    // boolean false
    // string null
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurasaki";
        nomes[2] = "Luffy";
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
