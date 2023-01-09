package day05typecastingstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" Stringinin money ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" Stringindeki money kelimesini "dollar" kelimesine ceviriniz.
        String newS1 = s.replace("money", "dollar");
        System.out.println(newS1);

        // Example 3: "s" Stringindeki "earn" kelimesini "win" kelimesine ceviriniz.

        String newS2 = s.replace("earn", "win");
        System.out.println(newS2); //Lwin Java win money

        // Example 4: "s" Stringindeki "a" harflerini "*" a ceviriniz.
        //Note: Replace metodunda coklu karakter ile calisirsaniz mecbur "" kullilir.
        //Ama tek karakterle calisirsaniz "" veya '' kullanabilirsiniz.
        //Ama ya ikisi de "" olmalidir ya da ikisi de '' olmalidir.

        String news3 = s.replace("a", "*");
        System.out.println(news3); //Le*rn J*v* e*rn money

        // Example 5: "s" Stringindeki "n" harflerini "XXX" a ceviriniz.
        String newS4 = s.replace("n", "XXX");
        System.out.println(newS4); //LearXXX Java earXXX moXXXey

        // Example 6: "s" Stringindeki "e" harflerini "XXX" siliniz.
        //Note: Hicbir sey char data typeinda yoktur bu yüzden replace() metodu kullanarak silme islemi yaparsaniz mutlaka "" kullaniniz.

        String newS5 = s.replace("e", "");
        System.out.println(newS5);

        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" Stringindeki tum rakamlari * a ceviriniz.
        //Bir grup datayi degistirmek icin replaceAll() kullanilir.
        //Bir grup datayi ifade etmek icin "Regular Expressions" kullaniriz.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
          Meshur Regex
          1) Tum rakamlari ==> [0-9]
          2) Tum kucuk harfler ==> [a-z]
          3) Tum kucuk buyuk harfler ==> [A-Z]
          4) Tum kucuk ve buyuk harfler ==> [a-zA-z]
          5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
          6) Tum noktalama isaretleri ==> \\p{Punct}
          7) Tum sesli harfler ==> [aeiouAEIOU]
              x, q, w harfleri ==> [xqw]

          8) Kucuk harflerden farkli tum karakterler. ==> [^a-z] (^den farkli demek )
          9) Tum harflerden farkli tum karakterler. ==> [^a-zA-Z]
          10) Space disindaki tum karakterler ==> \\S


         */
        //Example 8: "t" Stringindeki tum rakamlari ve harfleri  ! a ceviriniz.
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2); // !!! !! !!!!!!!!!!!

        //Example 9: "t" Stringindeki tum sesli harfleri  ? a ceviriniz.
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Example 10: "t" Stringindeki kucuk harfler disindaki tum charactrleri "<>" ceviriniz.
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Example 11: "t" Stringindeki tum harfler disindaki tum charactrleri "+" ceviriniz.
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5); //Ali++++yasindadir++++

        //Example 12: "t" Stringindeki tum spaceler disindaki tum charactrleri "+" ceviriniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6); // +++ ++ ++++++++++++++

        //Example 13: "t" Stringindeki sesli hatfler disindaki tum charactrleri "&" ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7); // A&i&&&&&a&i&&a&i&&&&&
    }
}
