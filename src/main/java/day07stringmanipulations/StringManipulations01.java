package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {


    public static void main(String[] args) {


        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen passwordunuzu giriniz ...");
        String pwd = input.nextLine();

        //i)En az 8 character olsun

        boolean lenghtConrol = pwd.length()>7;

        System.out.println("lenghtConrol = " + lenghtConrol);


        //ii)Space characteri password'de olmasin

        boolean spaceControl = !pwd.contains(" ");
        System.out.println("spaceControl = " + spaceControl);

        //iii)En az bir tane buyuk harf olsun

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length()>0;//[^A-Z] buyuk harf haric demek
        System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        //Av)En az bir tane rakam olsun

        boolean digitControl = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("digitControl = " + digitControl);

        boolean result = lenghtConrol && spaceControl && upperCaseControl && lowerCaseControl && digitControl;

        if(result){
            System.out.println("Gecerli password");


        }else{
            System.out.println("Password gecersiz");

        }


    }
}
