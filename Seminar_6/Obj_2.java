package Seminar_6;
// 1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 100.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите 
// процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

// Для вычисления процента используйте формулу:

// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class Obj_2 {
    public static void main(String[] args) {
        ArrayList<Integer> listik = creatLis();
        double pro = spetipic(listik);
        System.out.print(pro + "%");

    }

    public static ArrayList<Integer> creatLis() {
        ArrayList<Integer> lis = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            lis.add(rnd.nextInt(0,101));
        }
        return lis;
    }

    public static double spetipic(ArrayList<Integer> lis) {
        Set<Integer> set = new HashSet<>(lis);
        int j = lis.size();
        double p = (double)j;
        double proz = (double)set.size() * 100 / p;
        return proz; 
    }
}
