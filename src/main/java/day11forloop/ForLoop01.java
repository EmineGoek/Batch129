package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum characterleri console a yazdriniz.
        // "I love Java" ==> "I love J"

        String s = "I love Java ";

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(ch); //I love J
        }
        System.out.println();

        // Example 2: Verilen bir String'de son 'a' dan sonraki tüm karakterleri ters sirada yazdiriniz.
        // "Germany "==> yn
        String t = "Germany";

        for (int i =t.length()-1; i>=0; i--){
            char ch = t.charAt(i);
            if(ch=='a'){
                break;

            }
            System.out.print(ch);
        }
    }
}















