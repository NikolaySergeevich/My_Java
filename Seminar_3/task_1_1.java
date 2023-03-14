// package Seminar_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;



public class task_1_1 {
    public static void main(String[] args) {
        ArrayList<Integer> pop = new ArrayList<>(10);
        Random ran = new Random(10);
        for (int i = 0; i < 10; i++) {
            pop.add(ran.nextInt(1, 20));
        }
        pop.sort(Comparator.naturalOrder());
        for (Integer integer : pop) {
            System.out.printf("%d, ", integer);
        }
        System.out.println();
        System.out.println(pop);
    }
}
