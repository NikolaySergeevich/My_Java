package Homework.Hom_5;
// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.
public class Obj_2 {
    public static void main(String[] args) {
        HashMap<String, String> Spis = new HashMap<>();
        Spis.put("Иванов", "Иван");
        Spis.put("Петрова", "Светлана");
        Spis.put("Белова", "Кристина");
        Spis.put("Мусина", "Анна");
        Spis.put("Крутова", "Анна");
        Spis.put("Юрин", "Иван");
        Spis.put("Лыков", "Петр");
        Spis.put("Чернов", "Павел");
        Spis.put("Чернышов", "Петр");
        Spis.put("Федорова", "Мария");
        Spis.put("Светлова", "Марина");
        Spis.put("Рыкова", "Мария");
        Spis.put("Савина", "Мария");
        Spis.put("Лугова", "Марина");
        Spis.put("Владимирова", "Анна");
        Spis.put("Мечников", "Иван");
        Spis.put("Петин", "Петр");
        Spis.put("Ежов", "Иван");

        showStringString(Spis);
        HashMap<String, Integer> SpisSizeName = sizeName(Spis);
        showStringInteger(SpisSizeName);

        showSortMap(SpisSizeName);


        
    }

    // метод показа HashMap<String, String>
    public static void showStringString(HashMap<String, String> lis) {
        for (var item : lis.entrySet()) {
            System.out.printf("\n%s: %s", item.getKey(), item.getValue());
        }
    }

    // метод показа HashMap<String, Integer>
    public static void showStringInteger(HashMap<String, Integer> lis) {
        System.out.println();
        for (var item : lis.entrySet()) {
            if (item.getValue() > 1) {     
                System.out.printf("\n%s: %d", item.getKey(), item.getValue());
            }
        }
    }


    // метод создания словаря с подсчётом
    public static HashMap<String, Integer> sizeName(HashMap<String, String> lis) {
        HashMap<String, Integer> newLis = new HashMap<>();
        for (var element : lis.entrySet()) {
            if (newLis.containsKey(element.getValue())) {
                moreNum(newLis, element.getValue());
            }else {
                newLis.put(element.getValue(), 1);
            }
        }
        return newLis;
    }
    // метод увеличения счёта имени
    public static void moreNum(HashMap<String, Integer> Lis, String name) {
        int numb = Lis.get(name);
        Lis.put(name, numb+1);
    }

    // метод показа по убыванию
    public static void showSortMap(HashMap<String, Integer> Lis) {
        LinkedList<Integer> listSizeOfLis = new LinkedList<>(Lis.values()); 
        listSizeOfLis.sort(Comparator.reverseOrder());
        LinkedList<Integer> listFin = removeDuble(listSizeOfLis);
        System.out.println();
        for (Integer it : listFin) {
            for (var elem : Lis.entrySet()) {
                if (it == elem.getValue()) {
                    System.out.printf("\n%s: %d", elem.getKey(), elem.getValue());
                }
            }
        }
    }

    // метод удаления повторяющихся элеементов из списка и единицы
    public static LinkedList<Integer> removeDuble(LinkedList<Integer> lis) {
        LinkedList<Integer> listS = new LinkedList<>();
        boolean flag = true;
        for (Integer integer : lis) {
            for (Integer integer2 : listS) {
                if (integer == integer2) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                listS.add(integer);
            }else{
                flag = true;
            }
        }
        listS.removeLast();
        return listS;
    }

}
