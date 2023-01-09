package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //Example 1: Size v erilen bir String'i tersten yazdiriniz
        // "Germany"==> ynamreG

        String s = "Java";
        String t = "";

        for (int i =s.length()-1; i>=0; i--){

            t = t + s.charAt(i);

        }
        System.out.println(t);

        //Example 2: Size verilen bir Stringin "Palindrome" olup olmadigiini konrol eden kodu yaziniz
        // civic, nalan, kucuk, 11211==> Palindrome

        //Logic : Stringi ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise "Palindrome" de.

        String duz = "civic";
        String ters = "";
        for(int i=duz.length()-1; i>=0; i--){

            ters = ters + duz.charAt(i);

        }
        if (duz.equals(ters)){
            System.out.println(duz + " : Palindrome'dur");
        }else {
            System.out.println(duz + " : Palindrome degildir");
        }
    }
}
