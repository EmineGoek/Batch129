package day13whileloopdowhileloop;

import java.util.Arrays;
import java.util.Scanner;

public class Übung {
    public static void main(String[] args) {
        /*   1
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz

        Lösung:
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
          System.out.println("Lutfen bir sayi giriniz");
          num = input.nextInt();

          if (num>=100) {
              System.out.println("Kazandiniz!");
          }
      }  while (num >=100 );
        System.out.println("Kaybettiniz!");

         */




        /* 2
                Gecerli Username="admin" ve Password="pwd123" dur.
                Kullanicidan username ve password'u alin.
                Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
                Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
                Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz

        LÖSUNG:
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        do {
            if (counter ==4) {
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }
            System.out.println("Lutfen username giriniz");
            String username = scan.next();

            System.out.println("Lutfen password giriniz");
            String pwd = scan.next();

            if (username.equals("admin") && pwd.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            counter++;
        } while (true);

         */


        /*  3
        Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console a yazdiriniz.
           3==> 3x1=3  3x3=6 3x3=9 3x4=12 ... 3x10=30

        Lösung:

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int num = input.nextInt();
        int i = 1 ;

        while (i<11) {

            System.out.println(num + "*" + i + "=" + (num * i));

            i++;
        }


         */



        /*   4
        Verilen bir String de her harfin sonrasina * sembolü ekleyiniz.
         Java => J*a*v*a*

        LÖSUNG:
        Scanner input = new Scanner(System.in);
        System.out.println("Kelime giriniz:");
        String word = input.next();
        String newWord = "";
        int i = 0;

        while (i < word.length()){

            newWord = newWord + word.charAt(i) + "+";

            i++;
        }
        System.out.println(newWord);
         */


        /* //Example 5: Array'deki her elemani sonuna ! isareti koyarak yazdiriniz.

         */
        Scanner input = new Scanner(System.in);
        String stdNames[] = new String[5];

        stdNames[2]="Ajda";
        stdNames[0]="Cuneyt";
        stdNames[1]="Kemal";
        stdNames[3]="Ezel";
        stdNames[4]="Besir";

        for (int i=0; i<stdNames.length; i++){
            System.out.println(stdNames[i] + "!");
        }

    }
}
