package day04scannerincrementdecrementifstatements;

import javax.swing.*;
import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {


        //Example 2 : Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");

        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Cift sayi...");
        }
        if (num % 2 !=0){
            System.out.println("Tek sayi... ");


        }

        //2. Yol
        //if-else statements

        if(num%2==0){
            //burasi calisir (true)
            System.out.println("Cift sayi");

        }else{
            //burasi calisir(false)
            System.out.println("Tek sayi");

        }




    }
}
