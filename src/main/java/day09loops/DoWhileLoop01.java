package day09loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //while loop

//        while(loop calisma kurali){
//            calisacak kodlar
//                    artirma/azaltma
//        }


        //do while loop

//        baslangic degeri
//                do{
//                    calisacak kodlar
//                            artirma/azaltma
//
//                }while(loop calisma kurali);

        //Example 1: 5(dahil) den 3(dahil)  e kadar tamsayilari console yazdiriniz

        int i = 5;

        do {
            System.out.println(i);

            i--;

        } while (i > 2);


        //-------------------------------------------------------------------------------------------------------------

        // 1 ) while loop
//        1) while loopda hic calismadi
//        2)while loopda zero execution mumkundur
        int a = 1;

        while (a < 1) {




            System.out.println("Sen bir shile loopsun...");

            a++;

        }


        // 2 ) do-while-loop
        //1)do while loopda body calisti
        //2)do while loop kullandiginizda loop body en az
        //bir kere calisir

        //do while loop da zero execution mumkun degildir

        int b = 1;

        do {

            System.out.println("Sen bir do-while loopsun");

            b++;

        } while (b < 1);



    }
}
