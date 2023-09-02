package day06switchternarystring;

public class StringManipulations02 {

    public static void main(String[] args) {


        String s = "learn Java 234earn m234oneysdasdasdasdasd";

        //Example 1; s String indeki money kelimesini dollar kelimesine ceviriniz

        String s1 = s.replace("money","dollar");

        System.out.println("s1 = " + s1);

        //Example 2 : s String indeki tum e harflerini siliniz
        String s2 = s.replace("e","");
        System.out.println("s2 = " + s2);

        //Ornek 3: s String indeki tum rakamlari * a cevir

        String s3 = s.replaceAll("[0-9]","*");
        System.out.println("s3 = " + s3);


/*
                        Meshur Regex'ler

    1) Tum rakamlar ==> [0-9]
    2) Tum kucuk harfler ==> [a-z]
    3) Tum buyuk harfler ==> [A-Z]
    4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
    5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
    6) Tum noktalama isaretleri ==> \\p{Punct}
    7) Tum sesli harfler ==> [aeiouAEIOU]
       x, q, w harfleri ==> [xqw]

    8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
    9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
    Sadece space karakteri : \\s
    Space karakteri haric  : \\S
    Sadece rakamlar        : \\d  (digit ten geliyor)
    Rakamlar haric         : \\D
*/
   //Example 4 : s String indeki rakam sayisinda bulunuz
        int num =s.replaceAll("[^0-9]","").length();
        System.out.println("num = " + num);
        //Note: ^ haric demek

    }
}
