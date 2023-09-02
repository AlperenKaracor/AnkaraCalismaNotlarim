package day11multidimensionalarrays;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        //Bir arrayin elemanlari eger array ise bu arrayler multidimensional olarak adlandirirlir

        //Multidimensional Array nasil olusturulur?

        int a[][] = new int[3][2];  // [[0,0] , [0,0] , [0,0]]

        //MultiDimensional Array lere nasil eleman eklenir?

        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;

        //Md array nasil console a yazdirilir?

        System.out.println(Arrays.toString(a));
        //MultiDimensional Arrayleri yazdirirken toString() methodu degil deepToString() methodunu kullaniriz
        //Arrayler non prmitiveleri kabul etmez sadece adreslerini barindirir
        System.out.println(Arrays.deepToString(a));

        //MultiDimensional Array den spesific bir eleman nasil yazdirilir
        System.out.println(a[1][1]);//45

        System.out.println(Arrays.toString(a[1]));

        //kisal yoldan MultiDimensional Array nasil olusturulur?
        String students[][] = {{"Ali", "Ahmet"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Example 1: Yukaridaki students array inde toplam kac isim oldugunu bulunuz

        int sum = 0;

        for (String[] w : students) {

            sum = sum + w.length;

        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array inde icinde "m" olan isimleri console'a yazdiriniz

        for (String[] w : students) {

            for (String k : w) {

                if (k.contains("m")) {
                    System.out.println(k);
                }

            }

        }




    }
}

