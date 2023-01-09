package day07ifstatements;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        //Example 1: Ay isimlari girilince kacnci ay oldugunu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ay ismi giriniz:");
        String monthName = input.next();

        if (monthName.equalsIgnoreCase("january")){
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("february")) {
            System.out.println(2);
        } else if (monthName.equalsIgnoreCase("märz")) {
            System.out.println(3);
        } else if (monthName.equalsIgnoreCase("april")) {
            System.out.println(4);
        } else if (monthName.equalsIgnoreCase("may")) {
            System.out.println(5);
        } else if (monthName.equalsIgnoreCase("june")) {
            System.out.println(6);
        } else if (monthName.equalsIgnoreCase("july")) {
            System.out.println(7);
        } else if (monthName.equalsIgnoreCase("august")) {
            System.out.println(8);
        } else if (monthName.equalsIgnoreCase("september")) {
            System.out.println(9);
        } else if (monthName.equalsIgnoreCase("october")) {
            System.out.println(10);
        } else if (monthName.equalsIgnoreCase("november")) {
            System.out.println(11);
        } else if (monthName.equalsIgnoreCase("december")) {
            System.out.println(12);
        }else {
            System.out.println("invalid month name");
        }
        /*
        Note: Stringlerin esitliklerini montrol ederken "==" yerine equals() kullaniriz.
        Niye?
        Cunku; "==" sembolu iki Stringi karsilastirirken sadece degerlerine bakar, ikisi de ayni ise Stringler esittir der ama
        biz code yazarken genellikle Stringlerin adresleri ile degil degerleri ile ilgileriniz. Bu yuzden String
        karsilastirmalarinda "==" kullanmayiz.

        equals() methodu ise iki Stringi karsilastirirken sadece degerlerine bakar,  degerler ayni ise
                    bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
                    ihtiyac duydugumuz seydir.


         */
        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t); //false cunku adresler ve degerler farkli.
        System.out.println(s.equals(t)); //false cunku; degerler farkli

        System.out.println(s==r); //false cunku; degerler farkli
        System.out.println(s.equals(r)); // true cunku equals() sadece degerlere bakar. "s" ve "r" nin degerleri ayni oldugundan true verir.

        System.out.println(s==m);

    }
}
