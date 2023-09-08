package day19oop;

public abstract class Courses {

    //Abstraction
    /*
    Body si olmayan methodlara abstract method denir
    1) Eger bir classtan object olusturulmasini istemiyorsak ve bu classi
    sadece child classlarin yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak
    "Abstraction" yapariz.
    2) Bazen parent classdaki methodun bodysi hicbir child class tarafindan kullanilmaz
    bu durumda parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir
    Bizde o methoda body yazmayiz.
    3)Methodun bodysini silince java bize hata verdi ,bizde abstract keywordunu kullanrak javaya
    bu methodun bodysi olmayacak deriz
    4) abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz, o yuzden
    classida abstract yapmaliyiz
    5) Parenttaki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yuzden tum child lar icin mecburi olmasini istedigimiz methodlari abstract yapariz

    6)Bodysi olan methodlar (concrete method) abstract classalrin icine yazilabilir
    Abstract methodlar
    7) Abstract keyword ile method body bir methodda ayni anda kullanilamaz
    *Final methodlar override edilemezler
    8)final methodlar abstract olamazlar final methodlar birkere override edilemezler
    halbuki abstract methodlar override edilmek icin olusturulurlar.Bu celiskidir bu nedenle
    abstract methodlarin final olmasina musaade etmez
    9) Abstract classlarin icinde abstract methodlar olur abstract methodlarin body si olmadigindan eksik methodlar
    gibi dusunulebilir dolayisiyla bu eksik yapi barindiran kaliptan eksik bir obje uretilmesini engellemek icin
    java abstract classlardan obje olusturulmasina musaade etmez
    10) Abstract classlarin constructorlari vardir ama obje olusturamazlar
    11) Abstract classin abstract childi veya concrete child i olabilir
    eger child abstract ise abstract methodlari override etmek zorunda degildir
    12)Abstract classlar private olamazlar cunku child classlar abstract methodlari kullanirlar

     */

    public abstract void math();


    public void art(){

        System.out.println("learn art");
    }

    public abstract void science();










}
