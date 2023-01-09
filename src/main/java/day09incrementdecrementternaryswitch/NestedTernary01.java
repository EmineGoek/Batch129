package day09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {

        /*
        Example 1: Verilen yilin artik yil olup olmadigini kontrol eden kodu yaziniz.
       1) Yil 100e bölünürse 400 e de bölünmelidir. ==>1600 :Leap year 1800 => Leap degil
       2) Yil 100e bölünmüyorsa 4'e bolunmelidir. ==> 2004==> Leap  2005: Leap degil
         */

        int year = 1600;
       String result =  year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");

        System.out.println(result);


    }
}
