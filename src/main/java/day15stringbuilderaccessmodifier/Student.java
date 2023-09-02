package day15stringbuilderaccessmodifier;

public class Student {


    /*

    public > protected > defualt > private
    public ===> her classdan kullanilabilir
    protected ==> baska package lardan kullanilamaz
                  ancak baska package larda child class icinden kullanilabilir
    defualt ==> baska package lardan kullanilmaz
    private ==> sadece olustutulduklari class icinden kullanilabilirler
    */

    //public her class dan kullanilabilirler

    public String stdName = "Ali Can";

    //protected olanlar baska package dan sadece child classlardan gorulebilir

    protected String adress = "Istanbul";


    //default access modifierlarda default keyword yazilmaz
    //default olanlar baska packegae dan kullanilamazlar
     String email = "alican@gmail.com";


     //private olanlar sadece olusturulduklari class icinde kullanilabilirler
     private String ssnId = "1234566445";













}
