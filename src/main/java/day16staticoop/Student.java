package day16staticoop;

public class Student {

    /*
    1) static variable veya static methodlar (class member) tum object ler icin ortak elemandir.
    2) static class memberlar uzerinde yapilan degisiklikler tum objeleri etkiler.
    3) static class memberlar class'a, non-static class memberlar objectlere monte edilir.
       Mesela bir classdan 100 tane obje olusturdugunuzda non-static olanlar 100 kere olusturulur.
       ama static olanlar obje sayisindan bagimsiz olarak bir kere olusturulur.
    4) static class memberlara ulasmak icin object olusturmaya gerek duyulmaz , ama non-static class memberlara
    ulasmak icin object olusturmak sarttir.
    5) static variable larin diger adi class variable dir,  non-static variable larin diger adi instance variable
    yada object variable dir
    //obje uzerinden ulasiyorsan non-static
    //class dan ulasiyorsan static


     */

    public static String stdName = "Ali Can";

    public int age = 18;

    public static void staticMethod(){

        System.out.println("Ben static methodum");

    }

    public  void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");

    }



}
