package day09loops;

import java.util.Scanner;

public class ForLoops01 {

    public static void main(String[] args) {

                /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */


        for (int i = 1; i < 5; i++) {

            System.out.println("Week : " + i);

            for (int k = 1; k < 8; k++) {

                System.out.println("   Day  : " + k);
            }

        }
        /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisiniz giriniz...");
        int row = input.nextInt();

        System.out.println("Sutun sayisiniz giriniz ");
        int column = input.nextInt();



        for (int i = 1; i <= row; i++) {//distaki loop satirlar icin satir sayisi kadar calistiriyor

            for (int k = 1; k <=column ; k++) {//icteki loop yanyana yazdigindan sutunlar icin sutun sayisi kadar calisti
                System.out.print("X ");
            }
            System.out.println();//satir yan yan print ile yazdirildigindan pointeri bir sonraki satira almak icin kullandik

        }


































    }
}
