package day02datatypesmethodcreation;

public class Variables01 {
    public static void main(String[] args) {
        //primitive data types-->char-boolean-byte-short-int-long-float-double
        //float:Virgüllü sayilar (Ondalik Sayilar - Decimal Numbers) icin kullanilir.(Fiyatlandirmalar - 12.99)
        //double:Virgüllü sayilar (Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre agirligi: 0.000000112)

        //Note: primitive data typlerini Java olusturmustur, biz olusturamayiz.
        //Note: primitive data typelarinin isimlerinde sadece kücük harf kullanilir.
        //Note: primitive datalar data typelara göre memory de farkli farkli yer kaplarlar.
        //Note: primitive datalar iclerinde sadece sizin atadiginiz degeri barindirirlar.

        //Ornek1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        //Java "Decimal Numbers"i otomatik olarak double kabul eder.
        // Data Type "float" yazilirsa hata verir.
        // float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz.
        //float memory de 4 byte yer kaplar, double 8 byte yer kaplar.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;

        System.out.println( shirtPrice + shoesPrice);

        //ornek2: hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun ve agirliklarin farkini ekrana yazdirin.

        double weightCell = 0.000000112;
        double weightAmip = 0.00000023;

        System.out.println(weightCell - weightAmip);



    }
}
