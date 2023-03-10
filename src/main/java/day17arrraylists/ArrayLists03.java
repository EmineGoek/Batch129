package day17arrraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        System.out.println(cities); //[Miami, Istanbul, Kayseri, Almaty]

        //remove() methodu index ile kullanilirsa o index'teki elemani siler.
        //remove() methodu index ile kullanilirsa size sildigi elemani verir.
        String n = cities.remove(1);
        System.out.println(n); // Itanbul
        System.out.println(cities); //[Miami, Kayseri, Almaty]

        //Remove() methodu eleman ile kullanilirsa ilk goruntuyu siler.
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true veya false verir.
        //eger eleman List te var ise o elemani siler ve size true der.
        //Eger eleman Listte yok ise o elemani silmediginden size false verir.
        boolean p = cities.remove("Kayseri");
        System.out.println(p);//true
        System.out.println(cities);//[Miami, Almaty, Kayseri]

    }
}
