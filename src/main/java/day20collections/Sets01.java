package day20collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    public static void main(String[] args) {


        /*
        1) Set'ler tekrarsiz eleman  (unique) depolamak icin kullanilir
        2) 3 tane Set Class i vardir
             a) HashSet Class
                Hash benzersiz id olusturma teknigidir.Bu teknige Hashing technique denir
                HashSet elemanlari rastgele siralar
                HashSet elemanlari siralamadigindan cok hizli calisir
                HashSetler null i eleman kabul eder

                b) LinkedHashSet Class
                    LinkedHashSet ler elemanlari sizin verdiginiz siraya gore dizdiklerinden (insertion order) HashSetlere
                    gore yavastirlar

                c) TreeSet Class
                    TreeSet elemanlari natural order ra gore dizerler
                    ve bu nedenle cok yavastirlar en yavas settir
                    null i eleman olarak kabul etmezler koyamazsin

                    3) TreeSet cok yavas oldugundan mumkun oldugu kadar TreeSet kullanmamaya calisiriz


       */

       HashSet<String> hs = new HashSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur]
        hs.add("Tuba");//Tekrarli elemanlari eklerken hata vermez ama sadece bir kere ekler
        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur]
        hs.add(null);
        System.out.println(hs);//[Kerem, null, Sinan, Tuba, Onur]

        LinkedHashSet<Integer>lhs = new LinkedHashSet<>();

        lhs.add(313);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs );//[313, 19, 7, 1, null] Senin verdigin siraya gore dizer (INSERTION OREDER)

        LinkedHashSet<Integer>ls = new LinkedHashSet<>();

        ls.add(313);
        ls.add(19);
        ls.add(7);
        ls.add(1);
        System.out.println(ls);

        lhs.retainAll(ls);

        System.out.println(lhs);//[313, 19]
        System.out.println(ls);//[313, 19, 17, 11]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null);
        System.out.println(ts);//[A, G, R, U, Z]
        System.out.println(ts.subSet('G', 'U'));





    }


}
