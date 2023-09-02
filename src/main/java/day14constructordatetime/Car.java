package day14constructordatetime;

public class Car {

    /*
    class olusturdugumuzda java bize otomatik olarak bir constructor verir
    Constructor nedir ?
    class olusturdugumuzda java bize otomatik olarak bir constructor verir
    Ama bu constructor gozle gorulmez , gozle gorulmeyen otomatik olarak java tarafindan verilen
    bu constructor lara default constructor denir

    Siz kendi constructor inizi olusturdugunuzda Java default constructoru siler

    Bir class da farkli parametreler kullanarak istedigimiz kadar constructor olusturabiliriz
    cunku farkli constructorlar sayesinde bir class dan farkli farkli objeler olusturabiliriz

    Constructor nasil olusturulur ?

    Access modifier  + Class ismi + () + {}

    interview sorusu:

    Methodlar ile Constructorlar arasindaki fark nedir?
    1) Methodlar return type olur, Constructor larda olmaz
    2) Methodlar yaptiklari ise gore isimlendirilirler , Constructorlar ise her zaman class ismi ile isimlendirilirler
    3) Methodlar bir aksiyon yapmak icin olusturulurlar , Constructorlar ise object olusturmak icindir
    4) Method isimleri kucuk harfler baslar , Constructorlar isimleri class ismi ile ayni oldugu icin buyuk harf ile baslar


     */

    //variable lar olusturma

    Car(String make, String model, int year, boolean hybird) {       //<=== Constructor (Gozle gorulmeyen) defualt
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybird = hybird;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;

    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }


    public Car(int year) {
        this.year = year;
    }

    String make = "Honda";

    String model = "Accord";

    int year = 2023;

    boolean hybird = true;

    //Methodlar olusturalim

    public void hareket() {
        System.out.println("Honda hizli hareket eder");

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybird=" + hybird +
                '}';
    }

    public void dur() {

        System.out.println("Honda guvenli bir sekilde durur");


    }

}
