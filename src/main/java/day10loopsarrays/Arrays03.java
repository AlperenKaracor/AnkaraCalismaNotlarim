package day10loopsarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabliriz

        int numbers[] = {12, 3, -3, 5, 23};

        for (int w : numbers) {

            if (w < 5) {

                System.out.println(w + " ");
            }
        }

        //Example : Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        String names [] = {"A","T","K","E","B"};

        //binarySearch()  binarySeach kullanacaksan once sort kullan
        //banarySearch()  methodunu sort() kullanmadan kullanmayiniz
        // cunku binarySearch() mantigi sirali elemanlar icin gecerlidir hata verbilir
        //binarySearch() methodu var olan elemanlar icin size o elemanin indexini verir
        //binarySearch() methodu olmayan elemanlar icin negatif bir tamsayi verir
        //"-" isaretinin anlami o eleman yok demektir
        //"sayi" ise o eleman arrayde olsaydi kacinci sirada olurdu bunu verir
        //Olmayan eleman icin - verdigi zaman siraya bak indexe degil
        //varsa index yoksa sira
        //ayni tipde coklu data saklamaya yarar array

        Arrays.sort(names);

        int result = Arrays.binarySearch(names,"E");
        System.out.println("result = " + result);


        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";
        System.out.println(s);


        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(words.length);




    }
}
