package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //E.g: Kullanicidan lacaginizi 5 basamakli bir sayinin ilk iki ve son iki basamagindaki rakamlari
        //toplami ni yazdiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bi sayi giriniz:");

        int number = input.nextInt();

        //son rakami al
        int lastDigit = number%10;
        System.out.println(lastDigit);

        //Sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number = number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        number = number/10;

        //sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        number = number/10;

        //sondan besinci rakami al
        int lastFifthDigit =number%10;

        System.out.println(lastDigit + lastSecondDigit + lastThirdDigit + lastFourthDigit + lastFifthDigit);


        //Sayiyi kucult
        number = number/10;
        System.out.println(number);

    }
}
