package day14constructordatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    /*
    DateTime Class ta kullanilan tarih saat formatlari
        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
        hh : mm a ==> 12'li saat sistemi AM, PM
        HH : mm : ss==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August  */

    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?

        LocalTime myCurrentTime =  LocalTime.now();

        System.out.println(myCurrentTime);//22:44:47.821544900


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm");

        String formattedTime = dtf1.format(myCurrentTime);

        System.out.println("formattedTime = " + formattedTime);

        //Date formati
        LocalDate myCurrentDate = LocalDate.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");

        String formattedMyCurrentDate = dtf2.format(myCurrentDate);

        System.out.println("formattedMyCurrentDate = " + formattedMyCurrentDate);

        //28/Aug/2023

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        String date2 = dtf3.format(myCurrentDate);
        System.out.println("Date2 = " + date2);

        //Baska bir zaman dilimindeki tarih ve zaman nasil alinir?

        //Tokyo da ayin kaci
        LocalDate dateInTokyo =  LocalDate.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("dateInTokyo = " + dateInTokyo);


        //Amsterdam da ayin kaci ?

        LocalDate dateInAmsterdam =  LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println("dateInAmsterdam = " + dateInAmsterdam);

        //Tokyo da saat kac?

        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInTokyo = " + timeInTokyo);

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("ldt = " + ldt);//ldt = 2023-08-28T23:17:07.881739600


        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd * MM * yyyy - hh : mm");
        String formattedLtd = dtf4.format(ldt);
        System.out.println("formattedLtd = " + formattedLtd);

    }

}
