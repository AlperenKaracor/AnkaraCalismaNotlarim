package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {


            /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen adinizi ve soy adinizi giriniz : ");
        String fullName = input.nextLine();

        System.out.print("Lutfen yasinizi giriniz : ");
        byte yas = input.nextByte();

        System.out.print("Lutfen boyunuzu giriniz : ");
        float boy = input.nextFloat();

        System.out.print("Lutfen kilonuzu giriniz : ");
        short kilo = input.nextShort();

        System.out.print("Lutfen medeniz durumunuzu giriniz : ");
        String medeniDurum = input.next();
        //next() methodu kullanicidan tek kelimeli string almak icin kullanilir

        System.out.print("Ad ve Soyad : " + fullName + "\nYasiniz : " + yas + "\nBoyunuz : " + boy
                          + "\nKilonuzu giriniz : " + kilo + "\nMedeni durumunuz : " + medeniDurum);





    }
}
