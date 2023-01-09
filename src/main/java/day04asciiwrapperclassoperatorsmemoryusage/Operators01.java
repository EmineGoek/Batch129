package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {
    public static void main(String[] args) {

        /*
        1) +, -, *, / islemleri Javada matematikte kullanildigi gibi kullanilir.
        Note 1: int / int ==> int olur.
        Note 2: double / int ==> double olur. Cunku; Javada matematiksel islemlerde farkli data typleri
        kullanilirsa sonuc buyuk data typeinda olur.

        2)Java'da "logical operator" lar vardır.
        i)  AND ve OR işlemleri "logical operator" lardır.
          AND işleminden true alabilmek için her şey true olmalıdır.
          AND işlemi "perfectionist" tir.
          AND işleminde bir tane false sonucu false yapar.

         ii) OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
             OR işleminde sonucun false olması için her şey false olmalıdır.
             OR işlemi "polyanna" gibidir.

         iii) NOT operatoru (!) true olani false, false olani true yapar.
              !true = false
              !false =true
              !!true = true

         3) Comparison (Karsilastirma) operators
              <,>, <=, =>, ==, !=
            Note: Karsilastirma operatorlerini kullandiginizda kesinlikle boolean (true veya false) alirsiniz.

            note: Biz AND islemi icin && kullaniiriz ama "&" kullanim da gecerlidir.
            farklari nedir?
            "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
            "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
            bu yüzden biz hep "&&" kullaniriz.
         */

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5 >= 19;

        System.out.println(first + "-" + second);
        System.out.println(first && second);
        System.out.println(first || second || third);







    }
}
