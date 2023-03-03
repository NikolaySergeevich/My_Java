package Homework.Hom_1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num_1 = scanner.nextInt();

        System.out.println("Введите один из знаков: +, -, /, * ");
        char zn = scanner.next().charAt(0);   

        System.out.print("Введите число: ");
        int num_2 = scanner.nextInt();

        scanner.close();
        int res;
        
        switch (zn) {
            case '+':
                res = num_1 + num_2;
                System.out.printf("\n%d %c %d = %d", num_1, zn, num_2, res);
                break;
            case '-':
                res = num_1 - num_2;
                System.out.printf("\n%d %c %d = %d", num_1, zn, num_2, res);
                break;
            case '/':
                res = num_1 / num_2;
                System.out.printf("\n%d %c %d = %d", num_1, zn, num_2, res);
                break; 
            case '*':
                res = num_1 * num_2;
                System.out.printf("\n%d %c %d = %d", num_1, zn, num_2, res);
                break;   
            default:
            System.out.println("Такой операции калькулятор ещё не владеет.");
                break;
        }

    }
}
