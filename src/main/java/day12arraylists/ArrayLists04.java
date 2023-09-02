package day12arraylists;

import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {

    public static void main(String[] args) {

        //Bir list olusturmak icin kisa yol
        List <Integer> list = Arrays.asList(4,5,13,313,353);//asList list gibi demek yani aslinda Array
        //asList methodunu kullanrak list olusturabilirsin

        System.out.println(list);//[4, 5, 13, 313, 353]

        //list.remove(0);//asList ile bir list olusturursan remove() methodunu kullanamazsin

        //list.add(63);//ayni sekilde asList ile olusturduysan add() ile eleman ekleyemezsin

        //list.clear(); buda ise yaramiyor

        /*
        Note : Arrays.asList() methodunu kullanarak bir  list olusturursaniz
        listin oge sayisini degistire nmethodlari kullanamazsiniz
        //ornegin remove() , add(), clear()
        ama set() kullanabilirsiniz
        is eleman sayisini degistirmeye gelince kullanamiyoruz methodlari asListde

         */

        list.set(1,63);

        System.out.println(list.size());
        System.out.println(list);



    }

}
