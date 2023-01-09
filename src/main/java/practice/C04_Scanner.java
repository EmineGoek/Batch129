package practice;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //E.g: Kullanicidan lacaginizi 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlari
        //toplami ni yazdiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bes basamakli bir sayi giriniz.");

        int num = input.nextInt(); //12345
        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkiRkm==>"+ ilkIkiRkm);

        int ilkIkiTop = (ilkIkiRkm %10) + (ilkIkiRkm / 10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiRakam = num%100;
        System.out.println("sonIkiRakam==>" + sonIkiRakam);
        int sonIkiTop = (sonIkiRakam%10) + (sonIkiRakam/10);
        System.out.println("sonIkiTop=" + sonIkiTop);

    }
}
