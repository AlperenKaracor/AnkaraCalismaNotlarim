package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodOverloading01 {
//Method Overloding ne demek : Java da  ayni isimde farkli isler yapabilen methodlar olusturmak demek
    //Neden var : Daha derli toplu bir yapi olsun diye
    public static void main(String[] args) {

        add(4, 5);

        String a = "123";

        Integer b = Integer.valueOf(a);

        System.out.println(b);


    }


    public static void add(int a, int b) {

        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b);
    }

/*
1)Method overloading yaparken method ismi degistirilmez
2)Method overloading yaparken method parametreler degistirilir
                  a) Parametre degistirilirken parametrelerin data typelari degistirilebilir
                  b) Parametre degistirilirken parametrelerin data typelari farkli ise yer degistirilebilir
                  c) Parametre degistirilirken parametrelerin sayisi degistirilebilir
3) Java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir
   Bu yuzden ismi ve parametre Method Signature olarak adlandirilir

4) Method overloading olusturulurken return type i degistirmenin hicbir etkisi yoktur
5) Method overloading olustururken access modifier i degistirmenin hicbir etkisi yoktur
6) Method overloading olustururken static veya non-static yapmanin hicbir etkisi yoktur
7) Method overloding olustururken body i degistirmenin hicbir etkisi yoktur

8)Private methodlar overload edilebilir
private olmak baska classlara gidildiginde problem olur , biz overloading ayni classta yapariz


    9) static methodlar overload edilebilir
    overloading yapmak icin method isimini degistirmeden method signature i degistiririz, dolayisiyle method signature degistirildiginde
    yeni bir method olusturmus oluruz bu nedenle static olmasi bir seyi degistirmez





 */


}
