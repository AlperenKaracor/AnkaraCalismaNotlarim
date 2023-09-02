package day07stringmanipulations;

public class StringManipulation03 {

    public static void main(String[] args) {

        //Example : Bir Stringdeki tekrarsiz characterleri ekrana yan yana yazdiriniz
        //   men=hmet ==>
        //lastIndexOf("m") ==> m nin stringdeki son gorunumunu verir


        String s = "mehmet";

//        s.indexOf("m"); //==> 0  //farkli ise tekrarli
//        s.lastIndexOf("m"); //==>3
//
//        s.indexOf("e"); //==> 1
//        s.lastIndexOf("e"); //==>4
//
//        s.indexOf("h"); //==> 2  ayni ise tekrarli
//        s.lastIndexOf("h"); //==>2
//
//        s.indexOf("t"); //==> 5
//        s.lastIndexOf("t"); //==>5

        if(s.indexOf("m") == s.lastIndexOf("m")){

            System.out.print("m");
        }

        if(s.indexOf("e") == s.lastIndexOf("e")){

            System.out.print("e");
        }

        if(s.indexOf("h") == s.lastIndexOf("h")){

            System.out.print("h");
        }
        if(s.indexOf("t") == s.lastIndexOf("t")){

            System.out.print("t");
        }
        System.out.println();
        //Example  Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789


        String cardNum = "1234 6789 1234 6789";

       String first =  cardNum.substring(0,15).replaceAll("[0-9]","*");

       String last = cardNum.substring(15);

        System.out.println(first+last);
        String result1 = first+last;
        System.out.println("result1 = " + result1);

        String result2 = first.concat(last);

        System.out.println("result2 = " + result2);


    }
}
