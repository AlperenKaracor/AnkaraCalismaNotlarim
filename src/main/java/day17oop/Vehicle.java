package day17oop;

public class Vehicle {

/*
Child classdan bir object olusturdugunuzda constructorlar en ustteki
parent classdan baslatilarak alta dogru calistirilir

Child class daki constructordan Parent class daki constructora a gidebilmek icin super() kullanilir
Parent class da birden fazla fazla constructor varsa istenilen constructor super() ifadesinin parantezi icine
yazilan parametreler yardimi ile secilebilir

Ayni class icindeki constructorlari secmek icin this() kullanilir, Ayni class da birden fazla constructor varsa
istenilen cons this() ifadesinin parantezi icinde yazilan parametreler yardimi ile scilebilir

super() ifadesini yazmak istege baglidir, yazmasanizda java sanki super() varmis gibi davranir. Ama kodumuzu
daha okunur kilmak icin yazmaniz tavsiye edilir

super() ve this() ifadeleri cons icinde herzaman ilk satirda olmalidir
Bir constructor icinde super() ve this() ifadeleri bir kere kullanilabilir

Inheritance da variable ve methodlari cagirmak icin this veya super kullanilir
this ayni class icindeki variable lari ve methodlari cagirmak icin kullanilir
super parent class icindeki variable lari ve methodlari cagirmak icin kullanilir



 */
    public Vehicle(){
         this(2222);
        System.out.println("Vehicle 1");


    }
    public Vehicle (int price){

        System.out.println("Vehicle 2");
    }

}
