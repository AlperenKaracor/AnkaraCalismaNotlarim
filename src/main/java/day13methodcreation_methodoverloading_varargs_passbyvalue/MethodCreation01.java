package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodCreation01 {

    public static void main(String[] args) {
        multiply(3, 5);

        int carpmaSonucu = multiply(3, 5);
        System.out.println(carpmaSonucu);

        int sonuc = ilkIkisiniCarpUcuncuIleTopla(4, 5, 6);

        System.out.println(sonuc);

        print("osman");

        //Eger bir method yeni bir data uretmiyor is return type i void olur
        //methodun return type i void ise method body icinde return keyword yazilmaz

        //Note : Method olusturmada kullanilan variable lar parametreler "parameters" olarak adlandirilir
        //      Method call da kullanilan degerlere Argumanlar "Arguments" denir.


    }

    //Example : 2 sayiyi carpma islemi yapan bir method olusturunuz

    protected static int multiply(int a, int b) {

        return a * b;
    }

    public static int ilkIkisiniCarpUcuncuIleTopla(int c, int d, int e) {

        return c * d + e;

    }

    //Example 3 : Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz

    public static void print(String str) {
        System.out.println(str);

    }


}
