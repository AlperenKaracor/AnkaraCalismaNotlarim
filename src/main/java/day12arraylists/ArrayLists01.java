package day12arraylists;

import java.util.ArrayList;

public class ArrayLists01 {

    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayListlere eleman nasil eklenir?

        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);

        System.out.println("ages arraylist" + ages);

        //ArrayListlere coklu eleman nasil ekleriz?

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        System.out.println(newAges);

        ages.addAll(newAges);
        ages.addAll(0, newAges);
        System.out.println(ages);//[1, 2, 3, 9, 656, 12, 777, 10, 888, 1, 2, 3]

        int numOfElement = ages.size();

        System.out.println(numOfElement);//12

        int eleman = ages.get(1);

        System.out.println(eleman);//2

        ages.set(1, 313);
        System.out.println(ages);

        //Example : Bir Integer ArrayList olusturun ve tek olanlari 11 olarak degistirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list);//[23, 24, 12, 9, 3]


        for (Integer w : list) {

            if (w % 2 != 0) {

                list.set(list.indexOf(w), 11);

            }
            System.out.println(list);

        }


    }


}


