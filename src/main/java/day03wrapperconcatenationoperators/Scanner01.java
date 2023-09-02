package day03wrapperconcatenationoperators;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //1 adim : Scanner class tan object olustur
        Scanner input = new Scanner(System.in);

        //2 adim : Kullaniciya ne istediginize dair mesaj ver
        System.out.println("Lutfen yasinizi giriniz :  ");

        //3 adim : Uygun methodu kullanarak kullanicinin verdigi data yi memory e yerlestiriniz
        byte age = input.nextByte();

        System.out.println(age);





    }




}
