package day19oop;

public interface Engine {

    void run();

   static void stop(){

        System.out.println("Stops security");

    }

    int price = 2000;
}
