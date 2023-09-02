package day02variables;

public class Variables01 {

    public static void main(String[] args) {
        //Variable nasil olusturulur?
        //Data Type+Variable Name+Assignment Operator+Variable Value  +';'
        int age = 13;

        System.out.println(age);
            /*
            Javada temelde iki tip data vardir;
            1)primitive data type;
                   char , boolean , byte , short , int , long , float , double

            2)non-primitive data type;
            String
              */

        //char data type: 2 byte
        // Tek karakterler icin kullanilir. Ornegin ==> A , a , ? , 5
        //Ornek 1 : char data type inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        // Data Type + Variable Name + Assignment Operator + Variable Degeri + ';'
        //Note: char data typeinda degerler tek tirnak icine konmalidir
        char isnimIlkHarfi = 'A';
        System.out.println(isnimIlkHarfi);

        //boolean data type:
        //boolean lar sadece iki farkli deger alabilir ; true veya false
        //Ornek 2 : boolean data type inda emeklimisin sorusu icin bir variable olusturun ve false degerini atayin
        boolean emeklimisin = false;
        System.out.println(emeklimisin);

        //byte data type :
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 ye (dahil) kadar tamsayi degerleri icin kullanilir
        //Ornek 3 : byte data type inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz

        byte ogrenciYasi = 13;
        System.out.println(ogrenciYasi);

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz
        short siteNufusu = 1300;
        System.out.println(siteNufusu);

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,483,648 ile 2,147,483,647 arasinda sayilar icindir
        //Ornek Ulke nufusu icin bir variable olusturup deger atamasi yapiniz
        int ulkeNufusu = 1241241;
        System.out.println(ulkeNufusu);

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long cellNumberInHumanBody = 8989898989L;
        //Note:Eger long a atadiginiz deger int lerin araliginda ise sonuna L koymaya gerek yok
        //ama intlerin araligi disinda ise bunun long oldugunu sonuna L koyarak javay soylemeliyiz

        long weightOfSun = 12344545;

        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir.
        //float memory de 4 byte yer kaplar.
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun

        float gomlekFiyati = 299.99F;

        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun

        double hucreAgirligi = 0.0000001;
        System.out.println(hucreAgirligi);
        //Note ==> "E" exponent (us demek) 1.5 carpi 10 uzeri -11;






    }


}
