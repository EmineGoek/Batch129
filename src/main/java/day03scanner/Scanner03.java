package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Kullanicidan adresini liniz ve ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adresinizi giriniz:");

        //nextLine() method'u kullanıcıdan "cok kelimeli String" almak icin kullanilir.
        String address = input.nextLine();
        System.out.println(address);


    }
}
