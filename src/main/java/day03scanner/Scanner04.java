package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        // kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonucalrini ekrana yazdiran kodu yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz:");

        double firstNum = input.nextDouble();

        double secondNum = input.nextDouble();

        System.out.println(firstNum + secondNum);
        System.out.println(firstNum - secondNum);
        System.out.println(firstNum * secondNum);
        System.out.println(firstNum / secondNum);

    }
}
