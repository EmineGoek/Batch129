package selbstübung;

import java.util.Scanner;

public class MentoringHausaufgaben {
    public static void main(String[] args) {
      //  Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
        // 0-1-1-2-3-5-8-13-21-34...
        // a b c
        //   a b c
        //     a b c bu yüzden c=a+b 1.step
        // 2. stepte b c'ye esit, a da b ye. bu yolla döngü döndügünde eski degerler birbirine konup c hesaplanmis olacak.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz.");

        int fibo = input.nextInt();

        int a = 0;
        int b = 1;
        int c;

        for (int i=0; i<fibo; i++){

            c=a+b;
            a=b;
            b=c;

            System.out.print(c + "-");

        }

    }
}
