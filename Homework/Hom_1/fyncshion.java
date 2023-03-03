package Homework.Hom_1;

public class fyncshion {
    // Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n!
    // (произведение чисел от 1 до n)
    static void treygolNum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = num + sum;
            num--;
        }
        System.out.println("Треугольное число = " + sum);
    }

    public static void findJustNum(int num) {
        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf("%d, ", i);
            }
            
        }
    }
}
