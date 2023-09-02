package day04scannerincrementdecrementifstatements;

public class IncrementDecrement {

    public static void main(String[] args) {

    //Increment ;

        int a = 5;
        System.out.println(a);

        a = a + 2;
        System.out.println(a);

        a += 2;
        System.out.println(a);

        //Decrement
        int c = 8;
        System.out.println(c);

        c = c - 3;
        System.out.println(c);

        c -= 3;
        System.out.println(c);//2

        //Increment 2

        int d = 6;
        System.out.println(d);

        d= d *2;
        System.out.println(d);

        d *= 2;
        System.out.println(d);

        //Decrement 2

        int e = 24;
        System.out.println(e);

        e = e /2;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        int f = 13;

        f ++;

        int h = 5;

        h--;

        //post-increment  / pre-increment

        int i = 10;
        int k = i++;

        System.out.println("i = " + i);//10
        System.out.println("k = " + k);//11

        int m = 15;
        int n = ++m;

        System.out.println("m = " + m);//16 m satir sonunda artirildigi icin m nin degeri 16 olur
        System.out.println("n = " + n);//16 m artirildiktan sonra n ye konuldugu icin n nin degeri de 16 olur

        //Example :

        int p = 17;
        int r = p--;
        System.out.println("p = " + p);
        System.out.println("r = " + r);

        int s = 20;
        int t = --s;

        System.out.println("s = " + s);
        System.out.println("t = " + t);


    }
}
