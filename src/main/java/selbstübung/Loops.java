package selbstübung;

public class Loops {
    public static void main(String[] args) {
        //Example 1: Ekrana 5 kere "Hi" yazdiriniz.
        String h = "Hi";
        for (int i = 1; i < 6; i++) {
            System.out.println(h);
        }
        //Example 2: 11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i=11; i<15; i++){
            System.out.print(i);
        }
        System.out.println();
        //Example 3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i=40; i>22; i--) {
            if (i % 2 == 0) {
                System.out.print(i);
            }

        }
        System.out.println();
        //Example 4: 8'den 56'ya kadar tum teksayilari ekrana yazdiran kodu yazdiriniz.
        for (int i=8; i<56; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        /*//Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum characterleri console a yazdriniz.
        // "I love Java" ==> "I love J"
        String s = "I love Java";

        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == 'a') {
                break;
            }
            System.out.print(s.charAt(i));
        }

         */
        System.out.println();
        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i=21; i<181; i++) {
            if (i%4 == 0 && i%6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Example 2: Suize verilen kucuk harfle yazilmis Stringin indexi cift sayi olan karakterlerini buyuk harf yapiniz.
        //  ankara ==> AnKaRa
        String s = "ankara";

    }
}
