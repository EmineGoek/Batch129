package practice.stringmanipuation;

import java.util.Scanner;

public class C01StringMan {
    public static void main(String[] args) {
     /*
    1) Kullanicidan email adresini girmegirmesini isteyin,
    mail@gmail.com ocermiyorsa "Lutfen gmail adresi giriniz",
    @gmail.com ile bitmiyorsa lutfen yazimi kontrol edin yazdirin
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz: ");
        String mail = input.nextLine() ;

        if (!mail.contains("@gmail")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if ( mail.lastIndexOf("@gmail.com")==(mail.length()-10)) {
            System.out.println("Email adresi kaydedildi");
        }else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }

    }


}
