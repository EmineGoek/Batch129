package practice.ifstatement;

import java.util.Scanner;

public class C01_If {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num2 = input.nextInt();

        if (num2==0){
            System.out.println("cift sayi");
        }else
            System.out.println("tek sayi");

        //verilen bir sayinin negatif pozitif ya da nötr oldugunu söyleyen kodu yaziniz.

        int number = 105;

        if (number < 0){
            System.out.println("negatif sayi");
        } else if (number == 0) {
            System.out.println("notr sayi");
        }else
            System.out.println("pozitif sayi");


    }






}
