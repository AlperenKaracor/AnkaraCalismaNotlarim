package day10loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a = 7;

        a = 5;

        //Array nasil olusturulur
        //Arrays.toString arrayleri gorebilmek icin

        String stdNames [] = new String[5];

        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]

        //toString() methodu kullanmadan sadece array ismini yazdirirsaniz java size o Array in adresini verir

        //Array e eleman eklemek

        stdNames [2] = "Ali";
        stdNames [1] = "Enes";
        stdNames [3] = "Azize";
        stdNames [4] = "Zafer";
        stdNames [0] = "Fatma";

        System.out.println(Arrays.toString(stdNames));//[Fatma, Enes, Ali, Azize, Zafer]

        //Arrayden Spesifik bir eleman almak icin indexini yaz
        System.out.println(stdNames[1]);//Enes

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String cities [] = new String[5];
        cities [0] = "Sivas";
        cities [1] = "Denizli";
        cities [2] = "Bayburt";
        cities [3] = "Adana";
        cities [4] = "Ankara";

        //1. yol
        //Note : lenght Stringlerde parantezli (method) idi,
        // arraylerde ise parantezsiz (method degil variable) kullanilir
        int totalChar = 0;

        for (int i = 0; i < cities.length; i++) {

          totalChar =  totalChar + cities[i].length();

        }
        System.out.println(totalChar);

        //2.yol : for - each loop (enhanced loop)


        int sum = 0;

//        for(Data Type w : array/collection){
//            calisacak kodlar
//
//        }

        for(String w : cities){

            sum = sum + w.length();
        }
        System.out.println(sum);





    }
}
