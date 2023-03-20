package Seminar_6;
// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.

public class Obj_1 {
    public static void main(String[] args) {
        HashSet<Integer> pop = new HashSet<>();
        pop.add(1);
        pop.add(2);
        pop.add(30000);
        pop.add(2);
        pop.add(4);
        pop.add(5000);
        pop.add(6);
        pop.add(3);
        System.out.println(pop);

        LinkedHashSet<Integer> opo = new LinkedHashSet<>();
        opo.add(1);
        opo.add(2);
        opo.add(30000);
        opo.add(2);
        opo.add(4);
        opo.add(5000);
        opo.add(6);
        opo.add(3);
        System.out.println(opo);

        TreeSet<Integer> pp = new TreeSet<>(Comparator.reverseOrder());
        pp.add(1);
        pp.add(2);
        pp.add(30000);
        pp.add(2);
        pp.add(4);
        pp.add(5000);
        pp.add(6);
        pp.add(3);
        System.out.println(pp);
    }
}
