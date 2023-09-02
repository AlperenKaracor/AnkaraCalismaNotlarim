package day14constructordatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi nasil alabliriz

        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-08-28

        System.out.println(myCurrentDate.getMonthValue());//8
        System.out.println(myCurrentDate.getYear());//2023
        System.out.println(myCurrentDate.getDayOfMonth());//28
        System.out.println(myCurrentDate.getMonth());//AUGUST
        //Degismeyecek datalarin toplandigi data sabit degerlerin deposuna denir
        //Java da degismeyen sabit degerler buyuk yazilir full buyuk
        System.out.println(myCurrentDate.getDayOfWeek());//MONDAY

        //ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusYears(1).plusMonths(1).plusDays(1));//2024-09-29

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusMonths(1).minusDays(1).minusYears(1));//2022-07-27

        //Specific bir tarih objesi nasil olusturulur ?
        //Return type ==> LocalDate
        LocalDate date1 = LocalDate.of(1980, 5, 5);
        LocalDate date2 = LocalDate.of(2000, 5, 5);

        boolean r1 = date1.isAfter(date2);
        System.out.println("r1 = " + r1);

        boolean r2 = date1.isBefore(date2);
        System.out.println("r2 = " + r2);


        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year , month , and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();


        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())) {

            System.out.println("Invalid date");


        } else {
            System.out.println("Enter time for ticket");
        }

        //Example 2 : Kullanicidan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz

        System.out.println("Please enter year , month , and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);

        System.out.println(date.getDayOfWeek());


    }
}
