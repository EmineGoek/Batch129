package advanced_practice01.practice05;

public class Q03_ForLoop_UcgenNumara {
     /*
        Şekli Yazdırınız:

          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
    */
     public static void main(String[] args) {
         for (int i=1; i<7; i++){ //Satir kontrolü
             for (int bosluk=1; bosluk<i; bosluk++ ){
                 System.out.print(" ");
             }

           for (int j=i; j<7; j++){ //Sütun kontrolü
               System.out.print(j + " ");
           }
             System.out.println();
     }


     }

}
