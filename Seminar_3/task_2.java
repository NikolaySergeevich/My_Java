package Seminar_3;
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {
        ArrayList <String> planat = new ArrayList<>();
        planat.add("Юпитер"); planat.add("Марс"); planat.add("Юпитер"); planat.add("Солнце"); planat.add("Земля");
        planat.add("Земля"); planat.add("Юпитер"); planat.add("Юпитер");
        System.out.println(planat);
// -------------кусок создания и заполнения листа планетами без повторов
        ArrayList <String> planatCount = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < planat.size(); i++) {
            for (int j = 0; j < planatCount.size(); j++) {
                if(planat.get(i) == planatCount.get(j)){
                    flag = false;
                }
            }
            if(flag){
                planatCount.add(planat.get(i));
            }else{
                flag = true;
            }
        }
        System.out.println(planatCount);


// кусок кода, который считае кол-во одной планеты в изночальном листе

        StringBuilder vr = new StringBuilder();
        int count;
        for (int i = 0; i < planatCount.size(); i++) {
            count = 0;
            for (int j = 0; j < planat.size(); j++) {
                if(planatCount.get(i) == planat.get(j)){
                    count++;
                }
            }
            vr.append(planatCount.get(i)).append(" - ").append(count).append(", ");
        }
        System.out.println(vr);




        
    }
}
