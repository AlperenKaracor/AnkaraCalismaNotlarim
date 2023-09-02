package day14constructordatetime;

public class CarRunner {

    public static void main(String[] args) {

        Car c1 = new Car("BMW","M4",2023,false);

        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybird);

        c1.dur();
        c1.hareket();

        Car c2 = new Car("Audi","A5",2022,true);
        Car c3 = new Car("Honda","Civic",2015,false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }


}
