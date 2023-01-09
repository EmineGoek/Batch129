package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {
        // primitive: char         - boolean - byte - short - int -     long - float - double
        //Wrapper Class:Character  - Boolean - Byte - Short - Integer - Long - Float - Double    (AUTOBOXING) X (UNBOXING)
        //Wrapper Classlar non-primitive dir. o yüzden memoryde cok yer kaplarlar.
        //Bu yuzden sart degilse Wrapper Class kullanmayi tercih etmeyiniz.

        int n = 12; //"n" yazip . koyarsaniz hic metod goremezsiniz, cunku primitiveler method icermez.
        Integer m = 12;//"m" yazip . koyarsaniz bir cok method gorursunuz, cunku wrapper classlar metod icerir.

        byte p = 23;
        Byte r = 43;

        //  Example 1: short data typeinin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Example 2: int data typeinin minimum degeri ile byte data typenin max degerinin top bulunuz.
        int intMin = Integer.MIN_VALUE;

        byte byteMax = Byte.MAX_VALUE;

        System.out.println("Toplam: " + (intMin + byteMax));

        //Example 3: i) primitive int i Wrapper Inteer a ceviriniz.
        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22

        //          ii) Wrapper Byte i primitive byte a cevirelim.
        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Example 4: i)Primitive char'i Wrapper Character'e ceviriniz.(Autoboxing)
        char initial = 'T';
        Character initialWrapper = initial;

        //           ii)Wrapper Boolean'i primitive boolean'a ceviriniz.(Unboxing)
        Boolean isOld = true;
        boolean isOldWrapper = isOld;

        //Example5: Size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        String shirt = "2300";
        String shoes = "5200";

        //Javada "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
        //Javada "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa "concatenation islemi" olur.
        //Concatenation islemi birlestirme yapar.
        //Note: Concatenation islemlerinde Java matematikteki islem onceligi kurallarini kullanir.
        //Islem onceligi kurallari: i)Once uslu sayilar.
        //                          ii) parantez ici islemler yapilir.
        //                         iii) carpma ve bolme
        //                          iv) toplama ve cikarma
        System.out.println(shirt + shoes);

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);

        //Examole 6: Size String olarak verilen iki fiyatin toplamini ekrana yazdriniz.
        //Note: valueOf() methodu tum karakterleri rakam olan Stringleri sayilara cevirir.
        //      Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //      Bu hatayi duzeltmeyi ileride ogrenecegiz.
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);






    }
}
