package Seminar_4;
// Реализовать консольное приложение, которое: 
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Scanner scan_lin = new Scanner(System.in);
        Stack<String> arr_list = new Stack<>();
        String text = "";
        while (!text.contains("print")) {
            System.out.println(arr_list);
            System.out.print("Введите текст: ");
            text = scan_lin.next();
            if (text.contains("print")) {
                while (!arr_list.isEmpty()) {
                    System.out.print(arr_list.pop());
                }
            } else {
                arr_list.push(text);
            }
}

    }
}
