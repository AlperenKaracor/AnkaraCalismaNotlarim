package day20collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {

    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();

        depo.add("Sut");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);//[Sut, et, yumurta, peynir]
        depo.remove();
        System.out.println(depo);

        System.out.println(depo.peek());
        System.out.println(depo);


        depo.clear();
        System.out.println(depo);
        System.out.println(depo.poll());//null

        //System.out.println(depo.element());//Exception
        System.out.println(depo.peek());//Null

        Queue<String> wareHouse = new PriorityQueue<>();
        //Queue bir interfacedir ve cons() u yoktur o yuzden ya LinkedList ya da PriorityQueue kullanirsin
        //PriotrtyQoueue kullandigin zaman siralamayi sen yapabilirsin
        //Child class larin bazi ozelliklerini zorunlu yapmak istersen interface kullan
        //

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Orange");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);//[Egg, Milk, Meat, Orange, Tomatoes]

        //Double ended queu ==> iki uclu queue
        Deque<String> d=new LinkedList<>();

    }
}
