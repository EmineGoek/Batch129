package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        /*
        Javada method nasil olusturulur?
        1) main methodun disinda olusturulur.
        2) access modifier + Return Type + Method ismi + ()

        //Olusturulan metodlar nasil kullanilir?
          1) main metodun icinden kullanilir.
          2) metodun ismini + () yazin.
          3)Islem yapacaginiz sayilari parantezin icine koyun
         */
        int sonuc = add (30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2, 5, 8);
        System.out.println(ucluSonuc);

        double kup =getCube(5);
        System.out.println(kup);
    }
    public static int add (int a, int b){
        return a+b;
    }
    protected static long multiply (int a, int b){
        return a*b;
    }
    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu toplayan method'u olusturunuz ve kullaniniz.
    private static int firstTwoMultiplyThirdAdd (int a, int b, int c){
        return a*b+c;

    }
    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Note: Access Modifieri default yapmak icin access modifieri yazmayiniz.
    static double getCube (double a){
        return a*a*a;
    }

}
