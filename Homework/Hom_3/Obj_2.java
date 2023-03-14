package Homework.Hom_3;

import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class Obj_2 {
    public static void main(String[] args) {
        ArrayList<Integer> spisok = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            spisok.add(rnd.nextInt(20));
        }
        System.out.println(spisok);
        int max = spisok.get(0);
        int min = spisok.get(0);
        int sum = 0;
        for (int i = 0; i < spisok.size(); i++) {
            sum = sum + spisok.get(i);
            if (spisok.get(i) > max) {
                max = spisok.get(i);
            } else{
                if (spisok.get(i) < min) {
                    min = spisok.get(i);
                }
            }
        }
        double summ = sum;
        double sr = summ / spisok.size();
        System.out.printf("Среднеарифметичесское списка = %f\n", sr);
        System.out.printf("Максимально в списке число = %d\n", max);
        System.out.printf("Минимальное в списке число = %d\n", min);
    }

}
