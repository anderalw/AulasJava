package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.mome = "Astra";
        carro1.modelo = "GTI 2.0";
        carro1.ano = 2009;

        carro2.mome = "Vectra";
        carro2.modelo = "GTX 2.0";
        carro2.ano = 2015;

        //carro1 = carro2;

        System.out.println("Carro 1:s\n" + carro1.mome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("Carro 2:\n" + carro2.mome + " " + carro2.modelo + " " + carro2.ano);
    }
}
