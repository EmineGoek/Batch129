package practice.stringmanipuation;

import java.util.Scanner;

public class C02_StringMan {
    public static void main(String[] args) {
        /*
        Soru 2)Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
      "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
       iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
       iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz");
        String cumle = input.nextLine();

        if(cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("karar ver buyuk mu kucuk mu yazdirayim");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("cumle kucuk ya da buyuk kelimesi icermiyor");
        }


    }
}
