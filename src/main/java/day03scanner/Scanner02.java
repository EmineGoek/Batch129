package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz:");

        //next() method kullanicidan "tek kelimeli string" almak icin kullanilir.
        String firstName = input.next();

        System.out.println("Soyisminizi giriniz");

        String surname = input.next();

        System.out.println(firstName + " " + surname);
    }
}
