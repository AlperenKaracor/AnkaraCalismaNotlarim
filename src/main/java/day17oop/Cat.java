package day17oop;

public class Cat extends Animal{

    public void meow(){

        System.out.println("Cats meow..");

    }

    @Override//override annotation : override kurallarini java tarafindan
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }
}
