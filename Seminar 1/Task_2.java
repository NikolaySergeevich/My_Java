// Дан массив nums = [3,2,2,3,4,3] и число val  вводим с клавиатуры 

// Если в массиве есть числа, равные заданному, нужно перенести 
// эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива 
// должны быть отличны от заданного, а остальные - равны ему.
// Ввод: 3
// Вывод:
// 2, 2, 4, 3, 3, 3
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 3, 6, 4, 3, 7, 8, 5 ,4, 3}; 
        int[] mas = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        Scanner n = new Scanner(System.in);
        System.out.print("Введите число: ");
        int nam = n.nextInt();
        n.close();

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == nam) {
                mas[right] = arr[i];
                right --;
            }
            else {
                mas[left] = arr[i];
                left ++;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
