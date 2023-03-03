package Homework.Hom_1;

import java.util.Scanner;


public class task_1_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        fyncshion.treygolNum(num);

        System.out.println("Решим задачу на поиск простых чисел от 1 до числа, которое вы укажете");
        System.out.print("Введите число: ");
        num = scanner.nextInt();
        fyncshion.findJustNum(num);
        scanner.close();
    }
}
