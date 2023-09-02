package day06switchternarystring;

public class StringManipulations01 {

    public static void main(String[] args) {


        String s = "Java is easy";

        //Example 1: "s" String inde kullanilan character sayisini bulunuz

        int sLenght = s.length();
        System.out.println(sLenght);

        //Example 2: "s" String indeki ilk indexte bulunan character i ve son indexte bulunan karakteri aliniz
        //Note : index 0 dan baslar
        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        char lastChar = s.charAt(11);
        System.out.println(lastChar);

        char lastChar2 = s.charAt(s.length() - 1);
        System.out.println(lastChar2);

        //Note : s.charAt(0) kodu bize herzaman ilk karakteri verir cunku index 0 dan baslar
        //Note : s.charAt( s.lenght()-1) charAt method parantezine almak istedigimiz indexi vermemiz gerekiyor
        // s.lenght()-1 ile her zaman son index i alabilmeyi saglamis olduk
        //Note : lenght() uzunluktur  1 den baslar ama index 0 dan baslar bir kelimenin indexi her zaman uzunlugu -1 dir

        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        String s1 = s.substring(0, 4);
        System.out.println(s1);//Java


        String s2 = s.substring(5, 7);
        System.out.println(s2);//is

        String s3 = s.substring(8, 12);
        System.out.println(s3);//easy

        //2.yol
        //Bir characterden baslayarak sonuna kadar almak isterseniz o zaman  tek paramatreli methodu kullanbilirisniz
        String s4 = s.substring(8);
        System.out.println(s4);

        //Example 6 : "s" String inde easy kelimesinin olup olmadigini kontrol ediniz
        boolean isExist = s.contains("easy");
        System.out.println(isExist);//true

        //Example 7 : s String inin belli bir harfle baslayip baslamadigini kontrol ediniz
        boolean isStarts = s.startsWith("Java");
        System.out.println(isStarts);

        //Example 8 : s String inin easy ile bitip bitmedigini kontrol ediniz
        boolean isEnds = s.endsWith("easy");
        System.out.println("isEnds = " + isEnds);//true


    }
}
