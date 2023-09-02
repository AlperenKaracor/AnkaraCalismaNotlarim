package day15stringbuilderaccessmodifier;

public class Sb02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");

        System.out.println(sb1);//Java is easy

        sb1.reverse();

        System.out.println(sb1);//ysae si avaJ

        //Interview sorusu String i ters cevir

        //Verilen indexteki characteri siler
        sb1.deleteCharAt(0);
        System.out.println(sb1);//sae si avaJ

        //Baslangic index dahil bitis index(haric) ine kadar olan characterleri sil
        sb1.delete(0,3);
        System.out.println(sb1);//si avaJ

        //replace(0,2,"XXX"); 0 dahil 2 haric olmak uzere bu indexlere yazdigin Stringi koyar
        sb1.replace(0,2,"XXX");
        System.out.println(sb1);//XXXi avaJ

        sb1.insert(2,"777");
        System.out.println(sb1);//XX777Xi avaJ

        StringBuilder sb2 = new StringBuilder("Jaya");
        StringBuilder sb3 = new StringBuilder("Java");

        int result = sb2.compareTo(sb3);
        System.out.println(result);

        /*
        compareTo() iki StringBuilder i bastan baslayarak  harf harf karsilastirir
        ilk harf ayni ise ikincilere gecer , ikinciler ayni ise ucucnculere gecer
        ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir

        eger hic farkli harf yoksa sonuc olarak 0 verir

        0 alfabetik olarak ayni sirada demektir
        -1 ise sb2 sb3 den alfabetik olarak onde demektir
        sonuc 1 ise sb2 sb3 den alfabetik olarak sonra demektir



         */
        //StringBuilder nasil stringe e cevrilir?
        //toString() methodu StringBuilder i string e cevirir
        //String class da var olan ama StringBuilder class icinde var olmayan mesela split() methodu gibi
        // methodlara ihtiyac duydugumuzda bu method sayesinde string class icindeki methodlari kullanabiliriz
      String str =   sb2.toString().toUpperCase();

      //String nasil StringBuilder a cevrilir
        StringBuilder newSb1 = new StringBuilder(str);

        System.out.println(newSb1);


        /*
        1) StringBuffer Java da String ureten bir diger class dir
        StringBuffer java nin string uretmek icin olusturdugu ilk classdir

        2) StringBuffer StringBuilder a cok benzer yani ikiside mutable string uretir
        3) StringBuffer multi thread dir ama StringBuilder multi Thread degildir
        4) StringBuilder multi thread olmadigi icin StringBuffer dan daha hizli calisir
        5) multi thread yapilirken yapilan islemlerin siralamasi onem arzeder
             Yapilan isleri mantikli bir siraya koymak synchronization olarak adlandirilir
             StringBuffer multi thread oldugu icin ayni zamanda synchronized dir

                             a) immutable string lazimsa : String class
                             b) mutable string lazimsa : StringBuilder veya StringBuffer
                                      i) StringBuilder i multi thread gerekmezse kullaniriz
                                      ii) StringBuffer i multi thread gerekirse kullaniriz
         */

        StringBuffer sbf = new StringBuffer("Java");

        System.out.println(sbf);



    }
}
