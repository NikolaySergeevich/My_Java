package Seminar_4;
// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

import java.util.ArrayList;
import java.util.LinkedList;

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.
// System.currentTimeMillis()

public class task1 {
    public static void main(String[] args) {
        long tim = System.currentTimeMillis();
        ArrayList<Integer> pop = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            pop.add(0, 1);
        }
        long tim1 = System.currentTimeMillis();

        long res = tim1 - tim;
        int res2 = (int)(tim1 - tim);
        System.out.println(res);
        System.out.println(res2);


        LinkedList<Integer> opo = new LinkedList<>();
        long timOpo = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            opo.add(0,1);
        }
        long timOpofin = System.currentTimeMillis();
        long re = timOpofin - timOpo;
        int re2 = (int)(timOpofin - timOpo);
        System.out.println(re);
        System.out.println(re2);

    }

}
