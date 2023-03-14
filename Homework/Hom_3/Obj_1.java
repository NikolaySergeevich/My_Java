package Homework.Hom_3;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Obj_1 {
    public static void main(String[] args) {
        ArrayList<Integer> spisok = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            spisok.add(rnd.nextInt(20));
        }
        System.out.println(spisok);
        for (int i = spisok.size() - 1; i >= 0; i--) {
            if(spisok.get(i) % 2 == 0){
                spisok.remove(i);
            }
        }
        System.out.println(spisok);
    }
}
