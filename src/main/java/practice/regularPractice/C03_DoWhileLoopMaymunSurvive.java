package practice.regularPractice;

public class C03_DoWhileLoopMaymunSurvive {
    public static void main(String[] args) {

/*

    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */
        int numberofBananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            System.out.println("***** maymunlar yasamak icin gunde 4 muz yer******");
            numberofBananas-=4; //numberofBananas=numberofBananas-4
            System.out.println("Kalan muz sayisi" + numberofBananas);
            survivalDays++;
            if (numberofBananas<4){
                monkeyAlive=false;
                System.out.println("**Bugün" + survivalDays + ". gun yeterli muz kalmadi. Maymun sizlere ömür");
                System.out.println("Maymun " + survivalDays + ". gun öldü.");
            }else
                System.out.println("Bzgün " + survivalDays + ". gun maymun yasiyor.");
        }while (monkeyAlive);


    }
}
