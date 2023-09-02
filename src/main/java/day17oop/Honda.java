package day17oop;

public class Honda extends Car {

//Her constructorun altinda gorunmeyen bir super(); cons vardir ve bu
    public Honda(){
        System.out.println("super km = " + super.km);
        System.out.println("super.km = " + super.km);
        System.out.println("this.km = " + this.km);
        System.out.println("this.model = " + this.model);
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        super();
        System.out.println("Honda 2");
    }


    public String model = "Civic";

    public int km = 10000;

}
