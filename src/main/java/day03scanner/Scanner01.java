package day03scanner;

import java.util.Scanner;

public class Scanner01 {

    //Kullanicidan data alip kodalrimizda kullanacagiz.

    public static void main(String[] args) {

        //1.Adim: Scanner Class'dan object olustur.
        Scanner input = new Scanner(System.in);

        //2.adim: kullaniciya ne istediinze dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz:");

        //3. adim : uygun metodu kullanarak kullanicinin verdigi datayi memeorye yerlestiriniz.
        int age = input.nextInt();
        System.out.println(age);

    }



}
