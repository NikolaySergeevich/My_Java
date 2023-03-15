package Homework.Hom_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class funcshionaly {
    public static LinkedList<Integer> creatLinkedList() { // метод создаёт, заполняет ранд. числами и возвр. LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            list.add(rnd.nextInt(1, 20));
        }
        return list;
    }

    // принимает LinkedList и возвр. LinkedList в обратном порадке
    public static LinkedList<Integer> givFinishList(LinkedList<Integer> lis) { 
        LinkedList<Integer> finList = new LinkedList<>();
        Deque<Integer> promList = new ArrayDeque<>();
        for (Integer item : lis) {
            promList.addFirst(item);
        }
        for (Integer item : promList) {
            finList.add(item);
        }
        return finList;
    }
    // добавляет в конец листа элемент
    public static void enqueue(LinkedList<Integer> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        try {
            int num = scan.nextInt();
            list.add(num);
        } catch (Exception e) {
            System.out.println("Скорее всего вы вввели не число");
        }
        // scan.close();
    }

    // возвращает первый элемент из очереди и удаляет его
    public static Integer dequeue(LinkedList<Integer> list) {
        int num = list.removeFirst();
        return num;
    }

    // возвращает первый элемент из очереди, не удаляя
    public static Integer first(LinkedList<Integer> list) {
        int num = list.getFirst();
        return num;
    }

    // выбор функционала программы
    public static Integer chooseOperate() {
        System.out.println("\nИз предложенного функционала выберете и введите подходящий.\n"
        +"1 - помещает элемент в конец очереди\n"
        +"2 - возвращает первый элемент из очереди и удаляет его\n"
        +"3 - возвращает первый элемент из очереди, не удаляя\n"
        +"Что бы остановитьпрограмму - введите 0");
        Scanner sc = new Scanner(System.in);
        int num = 1;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Скорее всего вы вввели не число");
        }
        // sc.close();
        return num;
    }

    // процесс работы
    public static void work(LinkedList<Integer> list) {
        int numb = 4;
        while (numb != 0) {
            numb = chooseOperate();
            if(numb == 1){
                enqueue(list);
                System.out.println(list);
            }
            if(numb == 2){
                int removeFirst = dequeue(list);
                System.out.printf("\nУдалено число %d\n", removeFirst);
                System.out.println(list);
            }
            if(numb == 3){
                int firstNum = first(list);
                System.out.printf("\nПервый элемент списка = %d\n", firstNum);
                System.out.println(list);
            }
            if (numb == 0){
                System.out.println("Конец)");
            }
        }
    }
}









