package Seminar_5;

import java.util.HashMap;
import java.util.Map;

// создать справочник, который содержит в себе в виде ключа номер маспарта, 
// а в виде значения фамилию. и программа по фамилии должна показать номер паспорта
public class Task {
    public static void main(String[] args) {
        HashMap<Integer, String> bd_pas = pasports();
        for (Map.Entry<Integer, String> item : bd_pas.entrySet()) {
            if (item.getValue().equals("Иванов")) {
                System.out.println(item.getKey());
                System.out.println(item.getValue());
            }
        }
        for (Map.Entry<Integer, String> item : bd_pas.entrySet()) {
            if (item.getKey() == 345553) {
                System.out.printf("Номер: %s  Фамилия: %s \n", item.getKey(), item.getValue());
            }
        }
    }
    public static HashMap<Integer, String> pasports() {
        HashMap<Integer, String> pop = new HashMap<>();
        pop.put(123123, "Иванов");
        pop.put(345553, "Петров");
        pop.put(2222222, "Гайткевич");
        pop.put(5678, "Павловский");
        return pop;
    }
}
