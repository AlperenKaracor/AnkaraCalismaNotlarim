package day17oop;

public class Animal {

    //Overridingde method signature e dokunma
    //private methodlar override edilemez

    public void eat(){


        System.out.println("Animals eat");

    }

    public void drink(){

        System.out.println("Animals drink");
    }

    public Animal create(){

        return new Animal();


    }

    public int add(int a , int b){
        return a+b;


    }

    public Integer multiply(Integer a , Integer b){

        return a+b;

    }

    public final double circeArea(double r){

        return 3.14*r*r;

    }


}
