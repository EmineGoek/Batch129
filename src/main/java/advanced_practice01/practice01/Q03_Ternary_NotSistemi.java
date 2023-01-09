package advanced_practice01.practice01;

import java.util.Scanner;

public class Q03_Ternary_NotSistemi {
    public static void main(String[] args) {
        /*
        Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
        (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen notunuzu giriniz.");
        int noteSayi = input.nextInt();

        String noteHarf = noteSayi>100 ? "0 ile 100 arasi bir not giriniz" : noteSayi > 89 ?
                "A" : noteSayi>79 ?
                "B" : noteSayi>69 ?
                "C" : noteSayi>59 ?
                "D" : noteSayi>49 ?
                "E" : noteSayi>-1 ? "F" : "0 ile 100 arasi bir not giriniz";
        System.out.println(noteHarf);



    }
}
