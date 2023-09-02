package day16staticoop;

public class Animal {

    /*
    OOP conceptin 4 tane prensibi vardir
    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction

    1) Inheritance

    Ozellikleri bir classtan diger classlara alan bir kavramdir , bunun javadaki karsiligi sudur;
    Siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin bircogunu kapsiyor
    o zaman yeni olusturdugunuz classi ozelliklerini kullanmak istedigimiz class a child yapmalisiniz

    1) Inharitance in faydalari
      a) Code tekrarlarindan kurtuluruz
      b) Code tamiri (Maintenance) kolay olur
      c) Child class lari daha atomis yapmis oluruz
    2) Bir classi baska bir classin child classi yapmak icin extends keyword kullanilir
    3) Child class objectleri Parent class dan method ve variable lari kullanabilirler
    4) Parent class objectleri child class dan method ve variable lari kullanamazlar
    5) Javada bir classin sadece bir tane parenti olabilir , java coklu parenti (Multiple inheritance) desteklemez
    tekli parent i (single inheritance) destekler , java single inheritance destekler
    6) Apartman seklindki inheritance yapisina Multilevel inheritance deni java multilevel inheritanceyi i destekler
    is a desek child dan parenta bir iliskiden bahsediyoruz
    has a dersek parent dan child a bir iliskiden bahsediyoruz
    7) Object class her classin parentidir javada object class haric her classin parenti vardir
    8) Java da parent tan childa olan iliskilere HAS-A Relationship denir
       Javada child dan parenta olan iliskilere IS-A Relationship denir
    9) Java da  her class in bir tane default constructor i vardir. Bu default constructor class icinde gorunmez
    cunku default constructor Object class icindedir

    */

    public void eat(){

        System.out.println("animals eat");

    }

    public void drink(){

        System.out.println("Animals drink");
    }












}
