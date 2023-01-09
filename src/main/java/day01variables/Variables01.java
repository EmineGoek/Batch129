package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable olusturmak
        //Java cumlesi = Statement
        //Java'da esittir demek "==". Yani matematikte "=", Java'da "=="
        //Java`da "=" assinment operator"dir. sagdaki degeri alir soldaki kutuya koyar.
        //Access modifier yazmazsaniz "access modifier" "default" demektir.
        //Data Type + Variable Name ==> AAssignment
        //Eger Variable Declaration yapar, Assignmnent yapmazsaniz Java kendi degerlerini "Default koyar.
        //Default degerler sayilar icin sifirdir.
        //Data Type'ini yaziniz Variable ismini yaziniz Assignment Operator Variable degeri ingilizcedeki nokta gibi
               int                              age              =                13;

        //örnek 1: Ogrenci ismi icin Varible olusturup deger olarak Ali Can atayiniz.
        //Stringlere verilen degerler cift tirnak icinde olmalidir.
        //Stringler icin "default value" "null"dir.

        String studentName = "Ali Can";

         /*
         Java'da temelde iki tip data vardir;
          1)primitive data type
            char: Tek karakterler icin kullanilir. A, x, ?, 5
            boolean: booleanlar sadece iki farkli deger alabilir; true false
            byte:-128den +127 ye kadar tamsayi degerleri icin kullanilir.
            short:-32768 ile 32767 arasindaki tam sayilar icin kullanilir.
            int:-2,147,483..... ile 2,147.... arasindaki sayilar icindir.
            long: -9.222.,333.... ile -9,134,4434233...... arasindaki sayilar icindir.
            float:
            double:

          2)non-primitive data type
          */

        //Ornek: char data typeinda ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        // Note: char data type inda degerler tek tirnak icine kullanilmalidir.
        char isminIlkHarf = 'A';

        //örnek 3: boolean data typeinda emekli misin icin bir variable olusturun ve false degerini atayin.
        boolean emekliMisin = false;

        //ornek 4: byte data taypeinda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23;

        //ornek5: Site nüfusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 12000;

        //ornek 6 : ülke nüfuslari icin bir variable olusturup deger atamasi yapiniz.
        int countryPopulation =1234567890;

        //ornek 7: insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note: Bir degerlong ise sonuna "L" veya kucuk "l" konulur.
        long cellNumberInHumanBody = 876544321234565678L;

        //Eger long'a atadigimiz deger int'lerin arasinda ise sonuna "L" koymaya gerek yok.
        long weightOfSun = 1234567;



















    }
}
