package practice.ifstatement;

import java.util.Scanner;

public class C03_If {
    public static void main(String[] args) {
        //Kullanicidan gun isimlerini aliniz haftaici mi hafta sonu mu oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz:");
        String gunIsmi = input.next();

        if (gunIsmi.equalsIgnoreCase("cumartesi") || gunIsmi.equalsIgnoreCase("pazar")){

            System.out.println("haftasonu");

        } else if   (gunIsmi.equalsIgnoreCase("sali")||
                    gunIsmi.equalsIgnoreCase("carsamba") ||
                    gunIsmi.equalsIgnoreCase("persembe") ||
                    gunIsmi.equalsIgnoreCase("cuma") ||
                    gunIsmi.equalsIgnoreCase("pazartesi")){
        } else
            System.out.println("lutfen gecerli gun giriniz");

        // 2. YOL:

        boolean haftaici = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Sali") ||
                gunIsmi.equalsIgnoreCase("Carsamba") ||
                gunIsmi.equalsIgnoreCase("Persembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");

        boolean haftasonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");

        if(haftaici){
            System.out.println("Hafta ici");
        }else if(haftasonu){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }



    }
}
