package Homework.Hom_5;

import java.util.HashMap;
import java.util.LinkedList;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
public class Obj_1 {
    public static void main(String[] args) {
        HashMap<String, LinkedList<Integer>> spravochnic = new HashMap<>();
        fyncshion_for_1_obj.Hallo();
        while (true) {
            System.out.print("\nВведите номер задачи: ");
            int num = fyncshion_for_1_obj.givNum();
            if (num == 0) {
                break;
            }
            else{
                switch (num) {
                    case 1:
                        fyncshion_for_1_obj.addContact(spravochnic);
                        break;
                    case 2:
                        fyncshion_for_1_obj.showSpravochnic(spravochnic);
                        break;
                    case 3:
                        fyncshion_for_1_obj.help();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Функции под таким номером нет."); 
                }
            }
            

        }
    }
}
