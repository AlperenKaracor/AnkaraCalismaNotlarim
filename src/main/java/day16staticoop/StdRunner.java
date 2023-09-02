package day16staticoop;

public class StdRunner {
    //non-staticleri gorebilmek icin obje olusturmak sarttir
    //static variable uzerinde yapilan herhangi bir degisiklik objeler uzurinde hemen etki gosterir
    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin object olusturmadim
        //Sadece class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student ali = new Student();

        System.out.println(ali.age);

        Student.staticMethod();
        ali.nonStaticMethod();


    }

}
