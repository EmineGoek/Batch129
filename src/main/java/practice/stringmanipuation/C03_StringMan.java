package practice.stringmanipuation;

public class C03_StringMan {
    public static void main(String[] args) {
        /*
        soru 3: kisi isimleri icin 3 String degisken olusturunuz. Bosluk karakterleri haric 3 isimdeki
        karakter sayisinin toplamini yazdiriniz.
         */

        String e = "Emine";
        String u = "Enes Umut";
        String z = "Zeynep Mina";

        int c1 = e.replaceAll("\\s", "").length();
        int c2 = u.replaceAll("\\s", "").length();
        int c3 = z.replaceAll("\\s", "").length();

        System.out.println(c1 + c2 + c3);

    }
}
