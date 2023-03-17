package Homework.Hom_5;

import java.util.Random;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000
public class Obj_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] arr = new int[8][8];
        for (int i = 0; i < arr.length; i++) {
            int j = rnd.nextInt(8);
            arr[i][j] = 1;
            if (i!=0) {
                if (!checkVertical(arr, i, j) || !check_R_diagjnal(arr, i, j) || !check_L_diagjnal(arr, i, j)) {
                    for (int i2 = i; i2 >= 0; i2--) {
                        for (int j2 = 0; j2 < arr[i2].length; j2++) {
                            arr[i2][j2] = 0;
                        }
                    }
                    i = -1;
                } 
            }  
        }
        showArr(arr);
    }

    // метод вывода массива
    public static void showArr(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%d ", mas[i][j]);
            }
            System.out.println();
        }
    }

    // метод проверки по вертикали
    public static boolean checkVertical(int[][] mas, int i, int j) {
        boolean flag = true;
        for (int p = i-1; p >= 0; p--) {
            if (mas[p][j] != 0){
                flag = false;
                break;
            }
        }
        if (flag) {
            return true;
        }else return false;
    }
    // метод проверки по диагонали левой
    public static boolean check_R_diagjnal(int[][] mas, int i, int j) {
        boolean flag = true;
        if (i > j) {
            int m = i-1;
            for (int k = j - 1; k >= 0; k--) {
                if (mas[m][k] != 0) {
                    flag = false;
                    break;
                }
                else{
                    m = m - 1;
                }
            }
        }
        else{
            int m = j - 1;
            for (int k = i - 1; k >= 0; k--) {
                if (mas[k][m] != 0) {
                    flag = false;
                    break;
                }
                else{
                    m = m - 1;
                }
            }
        }
        if (flag) {
            return true;
        }else return false;
    }

    // метод проверки по диагонали правой
    public static boolean check_L_diagjnal(int[][] mas, int i, int j) {
        boolean flag = true;
        if (i + j > 7) {
            int m = i-1;
            for (int k = j + 1; k <= 7; k++) {
                if (mas[m][k] != 0) {
                    flag = false;
                    break;
                }
                else{
                    m = m - 1;
                }
            }
        }
        else{
            int m = j + 1;
            for (int k = i - 1; k >= 0; k--) {
                if (mas[k][m] != 0) {
                    flag = false;
                    break;
                }
                else{
                    m = m + 1;
                }
            }
        }
        if (flag) {
            return true;
        }else return false;
    }
}
