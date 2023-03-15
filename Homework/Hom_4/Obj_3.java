package Homework.Hom_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Obj_3 {
    public static void main(String[] args) {
        Deque<Object> lis = new ArrayDeque<>(); //Сюда будут скаладываться вводимые числа и результаты вычисления
        try {
            double firstNum = funcahForColc.givNum();
            funcahForColc.addNumQeueu(lis, firstNum);
            funcahForColc.operation(lis);
        } catch (Exception e) {
            System.out.println("Скорее всего вы ввели не правильные значения");
        }
        
    }
}
