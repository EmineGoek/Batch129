package practice.regularPractice;

import java.util.Scanner;

public class C01_ForLoopCdenOncekiA {
    public static void main(String[] args) {
        /*
   Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
*/
        Scanner input = new Scanner(System.in);

        String str = input.nextLine().toLowerCase();

        int sayac = 0; //+ ==>0  *==>1    str==>""  true;

        if (str.contains("a") && str.contains("c")){
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a'){
                sayac++;

            } else if (str.charAt(i)=='c') {
                break;

            }
        }
            System.out.println("c'den onceki a'larin sayisi: " + sayac);


    }else {
            System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir ifade giriniz.");
        }
    }
}
