package practice.ifstatement;

import java.util.Scanner;

public class C02_If {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(("Lutfen gun numarasini giriniz.. 1:Pazar \n2: Pazartesi \n3:sali \n4:carsamba \n5:persembe" +
                "\n6:cuma \n7:cumartesi"));

        byte gunNo = input.nextByte();

        if (gunNo == 1){
            System.out.println("pazar");
        } else if (gunNo==2) {
            System.out.println("sali");
        } else if (gunNo==3) {
            System.out.println("carsamba");
        } else if (gunNo==4) {
            System.out.println("persembe");
        } else if (gunNo==5) {
            System.out.println("cuma");
        } else if (gunNo==6) {
            System.out.println("cumartesi");
        }else
            System.out.println("pazartesi");
    }
}
