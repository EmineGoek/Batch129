package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullancidan bir dikdörtgenin iki kenar uzunlugunu aliniz.
        //i)Alanini hesaplayiniz.
        //ii) Cevresini hesaplayiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kisa kenari giriniz:");

        double kisakenar = input.nextDouble();

        System.out.println("Lutfen uzun kenari giriniz:");

        double uzunKenar = input.nextDouble();

        System.out.println("dikdörtgenin alani" + (kisakenar * uzunKenar));
        System.out.println("dikdörtgenin cevresi" + (kisakenar + uzunKenar)*2);

    }
}
