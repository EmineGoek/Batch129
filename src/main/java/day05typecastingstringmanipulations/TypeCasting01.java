package day05typecastingstringmanipulations;

public class TypeCasting01 {
    public static void main(String[] args) {

        /*
        Numeric primitive data typelarinin birbirine dönüstürülmesine type casting denir.
        Numeric Data Type'lar: byte - short - int - long - float - double

        Note 1: Kucuk data typelarini buyuk data typelarina cevirmeyi Java otomatik olarak yapabilir.
               Bu isleme "Auto Widening" denir.

        Note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bi istir, Java bu riskli isi otomatik olarak yapmaz.
                Bu islemi kod yazanlar yapar.
                Bu isleme "ExplicitNarrowing (Aciktan daraltma) denir.
         */

        //Byte data type ini int data type a ceviriniz.
        byte age = 13;
        int ageInt = age; //AutoWidening

        //long data typeini short data typeina cevirelim
        long weight = 234;

        short weightShort = (short)weight;

        //int data typeini float data typein a cevirniz.

        int population = 700000;
        System.out.println(population);
        float populationFloat = population;
        System.out.println(populationFloat);

     // double data typeini short data type a ceviriniz.

        double number = 12.234;
        System.out.println(number); //12.934

        short numberShort = (short)number;
        System.out.println(numberShort); //12

        //Dikkat! donusum yaptiginiz sayi (260), donuseceginiz data typeinin sinirlari disinda ise , Java kullandiginiz
        //sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur.
        //Example 1:
        short num = 260;
        System.out.println(num); //260

        byte numByte = (byte) num;
       System.out.println(numByte); //4

        //Example 2:
        short n = 1023;
        System.out.println(n);//1023

        byte nByte = (byte)n;
        System.out.println(nByte); //-1


    }
}
