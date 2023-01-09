package day02datatypesmethodcreation;

public class Homeworks02 {

    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz

    public static void main(String[] args) {


        //daire/çember çevre hasaplama

        double daireCevre = cevre (12);
        System.out.println("Dairenin Cevresi: " + daireCevre);

        //daire/çember alan hesaplama

        double cemberAlan = alan(23);
        System.out.println("Dairenin alani: " + cemberAlan);
    }

    public static double cevre (int yaricap) {
        return 2*yaricap*Math.PI;
    }

    public static double alan (int yaricap) {
        return Math.PI*yaricap*yaricap;
    }
}
