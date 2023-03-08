package Homework.Hom_2;

import java.util.Scanner;

public class Obj_3 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in, "Cp866");
        System.out.println("Введите текст: ");
        String text = scan.nextLine();
        scan.close();
        Fyncshion.PaliandrText(text);
        } catch (Exception e) {
            System.out.println("Что-то пошло не так, попробуйте ещё раз");
        }
        
    }
}
