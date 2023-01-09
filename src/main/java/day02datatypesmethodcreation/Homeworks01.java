package day02datatypesmethodcreation;

public class Homeworks01 {
    public static void main(String[] args) {
        //1)Dikdörtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
        //2)Dikdörtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz



        int alanSonuc = alan(4, 5);
        System.out.println("Alan : " + alanSonuc);

        int cevreSonuc = cevre(4, 6);
        System.out.println("Çevre: " + cevreSonuc);
    }
    public static int cevre(int kk, int uk) {
        return (kk+uk)*2;

    }
    public static int alan(int kk, int uk) {
        return kk*uk;

    }

}
