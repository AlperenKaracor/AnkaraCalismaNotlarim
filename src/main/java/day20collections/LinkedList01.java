package day20collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    public static void main(String[] args) {


        ArrayList<String> list1 = new ArrayList<>();

        List<String> list2 = new ArrayList<>();

        //interfacelerden obje olusturamayiz List bir interfacedir
        //Arraylistler eleman silem ve eklemede tekrar indexleme
        // yapmak zorunda olduklarindan cok basarisizlirdar
        //
        /*
        LinkedListler index kullanmazlar bu yuzden node ekleme
        ve silme islemlerinde tekrar indexleme yapilmaz, Linkedlistlerde
        node ekleme ve silme islemlerinde sadece pointer lari degistirir
        1)Arraylisler eleman ekleme ve silme de basarisizlardir
        o yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist
        kullanmak tavsiye edilmez
        2) LinkedListler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina
        gerek yoktur buda LinkedListleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar
        kontrol edilir buda cok fazla is demektir

         */

        LinkedList<String> list = new LinkedList<>();

        list.add("Mehmet");
        list.add("Ahmed");
        list.add("Onur");
        list.add("Kubra");
        list.add("Osman");
        list.add("Duygu");

        System.out.println(list);//[Mehmet, Ahmed, Onur, Kubra, Osman, Duygu]

        list.add(1,"Zafer");//[Mehmet, Zafer, Ahmed, Onur, Kubra, Osman, Duygu]

        System.out.println(list);

        list.addFirst("Onur");//[Onur, Mehmet, Zafer, Ahmed, Onur, Kubra, Osman, Duygu]
        System.out.println(list);

        list.addLast("Ibrahim");//[Onur, Mehmet, Zafer, Ahmed, Onur, Kubra, Osman, Duygu, Ibrahim]
        System.out.println(list);

        list.remove("Mehmet");//[Onur, Zafer, Ahmed, Onur, Kubra, Osman, Duygu, Ibrahim]
        System.out.println(list);

        //list.removeLastOccurrence("Mehmet"); son gorunumu siler
        //list.removeFirstOccurrence("Mehmet"); ilk gorunumu siler

/*
Retrieves, but does not remove, the head (first element) of this list.
Returns:
the head of this list, or null if this list is empty
 */
        System.out.println(list.peek());//ilk node u silmeden size verir
        System.out.println(list);

/*
Retrieves and removes the head (first element) of this list.
Returns:
the head of this list, or null if this list is empty
 */
        System.out.println(list.poll());//ilk node u size verir ama listten siler (cut paste)
        System.out.println(list);
        /*
        Retrieves, but does not remove, the head (first element) of this list.
Returns:
the head of this list
Throws:
NoSuchElementException – if this list is empty
         */
/*
Note : peek() ile element() ikiside ilk elemani silmeden size verir
peek() list bos oldugunda size null verir elemant() ise hata verir
 */
        System.out.println(list.element());
        System.out.println(list);
/*
Note : poll() ile pop() ikiside ilk elemani siler ve size verir
ama poll() list bos oldugunda size null verir pop() ise hata verir
 */
        System.out.println(list.pop());
        System.out.println(list);

    }

}
