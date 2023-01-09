package day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz
        // kucuk harf ise ekrana "kucuk harf " yazdiran kodu giriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz:");
        char ch = input.next().charAt(0);

        //1. Yol
        /*
         if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }

        if (ch>='a' && ch<='z'){
            System.out.println("kucuk harf");
        }
         */

        // 2. Yol:
        if (ch>='A' && ch<='Z') {
            System.out.println("Buyuk harf");
        } else if (ch>='a' && ch <='z') {
            System.out.println("Kucuk harf");
        }else {
            System.out.println("harf degil");
        }


    }
}
