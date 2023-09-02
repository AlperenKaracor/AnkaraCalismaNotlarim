package day02variables;

public class Variables02 {

    public static void main(String[] args) {
        //Ornek 9 : Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz

        String ogrenciIsmi = "Ali Can";


        //null 0 demek degildir. 0 da condingte bir degerdir
        //null hiclik demektir
        //null ici bos obje demektir

        /*
        Primitive ve non-primitive data type arasindaki farklar nelerdir?
        1)Primitiveler sadece bizim atadigimiz degeri icerir
          Non-primitiveler bizim atadigimiz degeri ve fazladan methodlar icerir

        2)primitiveler kucuk harfle baslar
          non-primitiveler buyuk harfle baslar

        3)primitiveleri java uretmistir ve 8 tanedir
          non-primitivleri Java ve programcilar uretebilir, sinirsiz sayidadir

        4) primitiveler memory de data type larina gore sabit boyutta bellek kullanirlar
           non-primitiveler memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler

        4) primitive data type lar memory de farkılı buyuklukte yerler kullanır
           non-primitive lerin hepsi memory de aynı buyuklukte yer kaplar.
  */
                      //Ogrenci notlari icin iki adet variable olusturun ve toplamlarini ekrana yazdirin
        //1. yol
        byte note1 = 50;
        byte note2 = 70;
        System.out.println(note1+note2);




       




    }
}
