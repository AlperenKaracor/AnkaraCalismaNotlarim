package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class PassByValuePassByReference {

    public static int add(int a, int b){

        return a+b;
    }

    public static void main(String[] args) {

     int x = 3;
     int y = 5;

     add(x,y);


     /*
     Pass By Value
     1) Java Pass By Value kullanir
     2) Yani java methodlarin orjinal degeri degistirmesine musade etmez
     3) Java methodlara deger yollarken orjinal degerin kopyasini olusturur , ve o kopyayi methoda yollar
     Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur

     Pass By Reference:
          1) Pass by Reference da method a reference yollanir
          2) Reference adres demektir . Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir



      */






    }


}
