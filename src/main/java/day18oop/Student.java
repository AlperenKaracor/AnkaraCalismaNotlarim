package day18oop;

public class Student {

    //Encapsulation - kapsulleme

    /*
    Encapsulation nedir? Data hiding (Veri saklama)
    Data nasil saklanir?
    Access modifier larini private yaparak datayi diger classlardan gorunmez hale getiririm
    boylece datayi saklamis olurum

    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz?

    get method olusturarak Encapsulate edilmis datanin degerini okuyabiliriz

     1) get method lar public olur
     2) get methodun return type i okudugu variable ile ayni olur
     3) get method bir boolean variable icin olusturulduysa ismi is ile baslar

     Encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirebiliriz
     set method olusturarak Encapsulate edilmis datanin degerini degistirebiliriz

     1) Set methodlar public olur
     2) Set methodun return type i her zaman void olur cunku bana birsey dondurmeyecek benim bverdigim degeri degistirecek
     3) Set method parametre kullanir , parametre data type i set edilmek istenen variable ile ayni olur

      Set methodlar class daki datayi degistirmez

      set method kullanarak varolan object uzerinde degisiklikler yaparak o objecti
      sanki yeni bir objectmis gibi kullanabiliriz
      get methodlarin diger adina getter set methodlarin diger adina setter denir

      Java beans ==>  getter ve setterlarin ikisine birden java beans denir

     */



    public String stdName = "Ali Can";

    public int age = 17;

    private double notOrt=3.87;
    private boolean succesful = false;
    private String stdId = "AC1234567";

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    private int bankAccount = 123;

    public String getStdId() {//getMethod
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }


    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
