package day08nestedifternary;

import java.util.Scanner;

public class Übung {
    public static void main(String[] args) {

        //EXAMPLE AA:
        /*
   TASK : Kullanicidan 3 tane pozitif bir tamsayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise "eskenar"
          Ucgen olma durumunu
          kontrol ediniz.

          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                           herhangi iki kenar farki ucuncu kenardan kucuk olmali

           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen



        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlarini giriniz");
        byte a = input.nextByte();
        byte b = input.nextByte();
        byte c = input.nextByte();
        boolean isTriangle = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && ( b+c>a && a>Math.abs(b-c));

        if (a<0 || b<0 || c<0){
            System.out.println("Ucgenin kenarlari negatif olmaz.");
        } else if (isTriangle){
            if (a==b && b==c && a==c){
                System.out.println("Eskenar ucgen");
            }else {
                System.out.println("Ucgen ama eskenar degil");
            }
        }else {
            System.out.println("Ucgen degil");
        }
 */




















        //Example EE: Kullanicidan iki sayi aliniz "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi");

        int i = input.nextInt();
        int k = input.nextInt();

        //1. yol
        if (i<k){
            System.out.println(i);
        }else {
            System.out.println(k);
        }

        //2. yol:
        int sonuc = i<k ? i : k;
        System.out.println(sonuc);





























    }
}
