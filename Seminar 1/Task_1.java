// Дан массив двоичных чисел, например [1,1,0,1,1,1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

// Вывод: 4

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,0,1,1,1,1,0,1,1,1,1,1,1};

        int count = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
            else {
                if (count > total) {
                    total = count;
                }
                count = 0;
            }
        }
    
        System.out.println(Arrays.toString(arr));

        if (total > count) {
            System.out.println(total);
        } else {
            System.out.println(count);
        }
        
    }


}
