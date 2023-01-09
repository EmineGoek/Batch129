package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        // Example 1 : Integer bir List olusturunuz.
        // List e 5 tane eleman ekleyiniz.
        // Bu elemanlardan 12 yi siliniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //Note: Siz Java da tamsayi yazdiginizda, Java o tamsayinin data type ini otomatik olarak "primitive int" kabul eder.
        // Bu yüzden remove() methodunun icine yazdiginiz tamsayi eleman olarak degil index olarak kabul edilir.
        // Tamsayiyi eleman olarak gostermenin bir kac yolu vardir.

        /*//1. Yol
        Integer nonPrimitive = 12;
        nums.remove(nonPrimitive);
        */
        //2. Yol: RECOMMENDED
       // nums.remove((Integer)12);

        //3. Yol:
        //nums.remove(Integer.valueOf(12));

        //4. Yol:
        //nums.remove(nums.indexOf(12)); // 2 metod kullanildi.

        System.out.println(ages); //[10, 25, 8, 40]

        // Example 2: Integer bir List olusturunuz.
        // List e 5 tane eleman ekleyiniz.
        // Bu elemanlardan 12 yi siliniz.

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);

        List<Integer> silinecekler = new ArrayList<>();
        silinecekler.add(12);

        //removeAll() methodu List ile calisir.
        //removeAll() methodu bir veya birden fazla elemanin tum görünümlerini silmek icin kullanilir.
        nums.removeAll(silinecekler);
        System.out.println(nums);







    }
}
