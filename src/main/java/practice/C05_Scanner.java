package practice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin en ve boyunu alan ve hesaplaya kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen kisa kenar uzunlugunu giriniz:");

        int en = input.nextInt();

        System.out.println("Lutfen uzun kenari giriniz:");
        int boy = input.nextInt();

        System.out.println("alan:" + (en*boy));
        System.out.println("cevre:" + 2*(en+boy));



    }
}
