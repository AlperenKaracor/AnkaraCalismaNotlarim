package day20collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {


        //Example 1 : Ogrenci email adreslerini narutal order da siralanmis olarak depolayiniz
       //1.yol
        long t1 = System.nanoTime();

        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        emails.add("d@gmail.com");
        emails.add("e@gmail.com");
        emails.add("f@gmail.com");
        emails.add("g@gmail.com");
        emails.add("h@gmail.com");
        emails.add("t@gmail.com");
        emails.add("z@gmail.com");

        System.out.println(emails);

        long t2 = System.nanoTime();

        //2.yol

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("c@gmail.com");
        emailsHs.add("d@gmail.com");
        emailsHs.add("e@gmail.com");
        emailsHs.add("f@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("h@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("z@gmail.com");

        TreeSet<String>emailHSTs = new TreeSet<>(emailsHs);

        System.out.println(emailHSTs);
        long t3 = System.nanoTime();


        System.out.println(t2-t1);//treeset
        System.out.println(t3-t2);//hashSet





    }

}
