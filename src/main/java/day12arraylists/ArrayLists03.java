package day12arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        nums.add(80);
        nums.add(81);
        nums.add(99);
//Arraylisleri sort etmek isterseniz collection class indan cagir


        Collections.sort(nums);

        System.out.println(nums);

        int minDiff = nums.get(1)-nums.get(0);

        //En kucuk farkin kac oldugunu bulan kodu yazalim

        for (int i = 1; i < nums.size(); i++) {

            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));


        }
        System.out.println(minDiff);

        //en kucuk farki hangi iki sayidan elde etiigimizi bulalim

        for (int i = 1; i < nums.size(); i++) {


            if(nums.get(i) - nums.get(i - 1 ) == minDiff){

                System.out.println(nums.get(i) + " ve "   + nums.get(i - 1 ));
            }

        }



    }

}
