package advanced_practice01.practice01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {
    public static void main(String[] args) {
        /*
  Kullanicidan String bir ifade aliniz.  Harflerini alt alta gelecek sekilde  " " bosluk veya 'a ' harfi geldiginde
   yazdirmayan diger karakterleri yazdiran kodu yaziniz
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadinizi arada bir bosluk olacak sekilde giriniz.");
        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);
        String ad = adSoyad.split(" ")[0];
        String soyAd = adSoyad.split(" ")[1];
        String adIlkHarf = ad.substring(0,1).toUpperCase();
        String soyadIlkHarf = soyAd.substring(0,1).toUpperCase();

        String adFormat = adIlkHarf+ad.substring(1);
        String soyadFormat = soyadIlkHarf+soyAd.substring(1);

        System.out.println("Ad: "+adFormat);
        System.out.println("Soyad: "+soyadFormat);









    }
}
