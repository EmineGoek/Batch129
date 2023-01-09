package practice;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Kullanicidan Data almak icin
        //1. Adim Scanner Classindan Object olusturun

        Scanner input = new Scanner(System.in);

        //2. Adim Kullaniciya ne yapacagini söyle

        System.out.println("Lutfen yasinizi giriniz");

        //3. Adim kullnicidan aladiginiz datayi varuiable icine koyun
        byte age = input.nextByte();


        // Kullaniciya ad, memleket, yas, boy,
        //yasadigi yeri sevip sevmedigini soran bir program yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim = scan.nextLine(); //Kullanicidan String bir deger istedik tümsatir=Nextline
        System.out.println("Lutfen memleketinizi giriniz:");
        String memleket = scan.next();
        System.out.println("Lutfen yasinizi giriniz:");
        int yas = scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz:");
        short boy = scan.nextShort();
        System.out.println("Lutfen yasadiginiz yeri sevip sevmediginizi yaziniz:");
        boolean seviyorMu = scan.nextBoolean();




    }
}
