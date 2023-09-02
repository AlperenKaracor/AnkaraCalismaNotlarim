package day12arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

        //Example : Tekrarli elemanlari olan bir listen sadece tekrarsiz elemanlari olan bir list elde edin

        // [J, a, v, a, v] ==> [J, a, v]

        List<Character> a = new ArrayList<>();

        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);//[J, a, v, a, v]

        List<Character> b = new ArrayList<>();

        for (Character w : a) {

            if (!b.contains(w)) {

                b.add(w);

            }
        }
        System.out.println(b);

        //Example : Bir String Arraylist olusturun ve "a" iceren elemanlari silin

        //for each kullandiginizda listlerde eleman sayisini azaltamazsiniz

        ArrayList<String> r = new ArrayList<>();

        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);//[Manisa, Nigde, Tokat, Van]

//        for (String w : r) {
//
//            if (w.contains("a")) {
//
//                r.remove(w);
//            }
//
//        }
//        System.out.println(r);

        for (int i = 0; i < r.size(); i++) {

            if (r.get(i).contains("a")) {

                r.remove(i);
                i--;//Silme islemi oldugunda indexler azalacagi icin i degerinide azaltmaliyiz

            }

        }

        System.out.println(r);


    }

}
