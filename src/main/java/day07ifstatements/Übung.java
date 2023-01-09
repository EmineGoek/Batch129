package day07ifstatements;

import java.util.Scanner;

public class Übung {
    public static void main(String[] args) {

        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz
        // kucuk harf ise ekrana "kucuk harf " yazdiran kodu giriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir harf griniz");

        char ch = input.next().charAt(0);


        if (ch>'@' && ch<='Z'){
            System.out.println("Buyuk harf..");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Kucuk harf..");
        }else {
            System.out.println("Harf degil..");
        }


        //Example 2: Kullanicidan alinan bir sayinin
        // tek mi cift mi oldugunu yazdiran kodu olusturunuz


        System.out.println("Lutfen bir sayi giriniz");

        int num = input.nextInt();

        if (num%2==0){
            System.out.println("Cift sayi");
        }else {
            System.out.println("Tek sayi");
        }





    }
}
