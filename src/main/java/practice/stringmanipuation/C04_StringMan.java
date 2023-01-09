package practice.stringmanipuation;

public class C04_StringMan {

        //Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.
        public static void main(String[] args) {


        String j = "Java ist gut.";
        int sonChIndex = j.trim().length()-1;
        String sonCh = j.substring(sonChIndex, sonChIndex +1);
            System.out.println(sonCh);

            // soru 2: Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda yazdırınız

            String str="Java cok kolay";
            String ilkkarakterdisindakiler=str.substring(1);
            System.out.println("ilk karakteri dışındaki tüm karakterler : "+ilkkarakterdisindakiler);

            // Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazınız
          String str1 = "Java cok guzel";
          Boolean sonuc = str1.contains("h");
            System.out.println(sonuc);

            boolean sonuc2 = str1.indexOf("v")!=-1;
            System.out.println("karakteri iceriyor mu");



}
}
