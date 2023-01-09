package day05typecastingstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        // String bir non-primitive data typedir ve ayni zamanda bir classtir.

        String s = "Java is easy";

        //Example 1: "s"Stringindeki tüm characterleri buyuk harf yapiniz.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper); //JAVA IS EASY

        //Example 2: "s" Stringindeki tüm characterleri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower); //java is easy

        //Example 3: "s" Stringindeki ilk characteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        // Example 4: "s" Stringindeki ikinci ve sondan ikinci characteri aliniz ve ekrana yanyana yazdiriniz.
        char secondChar = s.charAt(1); //a
        char secondLastChar = s.charAt(10); //s

        //1. Yol: Ayni satirda yazdirmak icin.
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2. Yol:
        System.out.println("" + secondChar + secondLastChar);

        //Example 5: "s" Stringinde kullanilan karakter sayisini bulunuz.
        int sLength = s.length();
        System.out.println(sLength); //12

        //Example 6: "s" Stringindeki ilk dört characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index harictir. [0, 4)
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);

        //Example 7: "s" Stringindeki "is" kelimesini aliniz.
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        //Example 8: "s" Stringindeki "easy" kelimesini aliniz.
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);

        //Bir karakterden baslayip Stringin sonuna kadar almak isterseniz, ikinci indexi yazmayiniz.
        //s.substring (8, 12); yerine s.substring(8); yaziniz.
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 9: "s" Stringinde "money" kelimesinin olup olmadigini kontrol ediniz.
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        /*
          Bir methodu ögrenirkne 3 sey mutlaka ögrenilmeli;
          i) Bu metod ne is yapar?
          ii) Bu methodun farkli kullanimlari nasildir?
          iii) Bu method ne return ediyor?
         */

        //Example 10: "s" Stringinin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Example 11: "s" Stringinin 6. karakterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isBegin = s.startsWith("i", 5);
        System.out.println(isBegin);


    }
}
