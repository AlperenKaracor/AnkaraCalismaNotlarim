package day06switchternarystring;

public class Ternary01 {

    public static void main(String[] args) {

        //Example : Bir sayinin mutlak degerini hesaplaya kodu yaziniz
        //  -4 ==> -1 * -4  4 ==> 4   0 ==> 0

        int c = 4;

        //Condtion ? true ise : false ise ;

       int result =  c<0 ? c * -1 : c ;
        System.out.println(result);

        //Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.

        int a = 13;
        int b = -7;

        Object  result1 = (a>0 && b>0) || (a<0 && b<0) ? a*b :  "Farkli isaretli sayilari carpamiyorum" ;
        System.out.println(result1);
        //Object , java da butun Non-primitive classlarin ortak parent() idir
        //Object in parenti yoktur
        //farkli data tipler icin ortak bir variable olusturmak istediginizde data type olarak object kullaniriz





    }
}
