package day08loops;

public class ForLoops01 {

    public static void main(String[] args) {

        //Example : Ekrana 5 kere "Hi" yazdiriniz

        //1.Yol ==> Tavsiye edilmez

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        //2. Yol

        /*
        for( Baslangic degeri ; Loop calisma sarti ; Arttirma / Azaltma ){
             tekrarlanmasi gereken kodlar
        {
         */

        //Baslangic degeri ; Loop calisma sarti ; Arttirma / Azaltma

        for( int i=1       ;       i<6          ;     i++         ){

            System.out.println("Hiy");

        }

        //Example :  11 den 14 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for(int i = 11 ; i<15 ; i++){

            System.out.println(i);
        }

        //Example 40'dan 23 e kadar tum cift tamsayilari ekrana yazdirin

        for( int i = 40 ;  i>22 ; i-- ){
           if(i%2 == 0){
               System.out.println(i);
           }

        }


    }


}
