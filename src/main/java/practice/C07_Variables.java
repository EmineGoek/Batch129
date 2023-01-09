package practice;

import java.util.Scanner;

public class C07_Variables {
    public static void main(String[] args) {
          /*
         TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresi
         bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.

          */
        Scanner input = new Scanner(System.in);
        System.out.println("TechProEd Spor salonun hosgeldiniz");
        System.out.println("Lutfen isim soyisim giriniz:");
        String name = input.nextLine();
        System.out.println("isim soyisim: " + name);
        System.out.println("Lutfen yasinizi giriniz: ");
        int age = input.nextInt();
        System.out.println("Yasiniz: " + age);
        System.out.println("Lutfen Kilonuzu giriniz: ");
        double kg = input.nextDouble();
        System.out.println("Kilonuz: " + kg);
        System.out.println("Lutfen boyunuzu giriniz: ");
        double height = input.nextDouble();
        System.out.println("Boyunuz: " + height);
        System.out.println("Salona kac ay devam edeceksiniz: ");
        int aylikUcret = 20;
        double topSure = input.nextDouble();
        double topFiyat = (topSure*aylikUcret);
        System.out.println("Toplam odeyeceginiz ucret :" + topFiyat);

        System.out.println("topFiyat = " + topFiyat);
        System.out.println("\nIsminiz :" + name + "\n" + "Yasiniz :" + age + "\n" + "Kilonuz: " + kg + "\n" +
                "Boyunuz: " + height + "\n"+"Odemeniz gereken toplam tutar: " + (topSure*aylikUcret));



    }
}
