package day03wrapperconcatenationoperators;

public class TypeCasting {

    public static void main(String[] args) {


        /*
        Numeric primitive data type larinin birbirine donusturulmesine Type Casting denir
        Numeric data typelar  byte  short int long float double

        Note 1: Kucuk data type larini buyuk data tiplerine cevirmeyi java otomatik yapabilir
        Bu isleme AutoWidening denir

        Note 2 : Buyuk data type larini kucuk data typelarina cevirmek riskli bir istir
        Java bu riskli isleri otomatik olarak ypamaz bu islemi kod yazanlar yapar
        BU isleme Explicit Narrowing denir

         */

        //Example : Byte data type ini int data type ina ceviriniz

        byte age = 13;
        int ageInt = age;

        //Example : int data type ini short data type ina cevir

        int weight = 313;

        short weightShort = (short) weight;


    }

}
