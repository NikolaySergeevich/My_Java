package Homework.Hom_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class Obj_1 {
    public static void main(String[] args) {
        LinkedList<Integer> starList = creatLinkedList();
        System.out.println(starList);
        LinkedList<Integer> finishList = givFinishList(starList);
        System.out.println(finishList);
        
    }
    public static LinkedList<Integer> creatLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            list.add(rnd.nextInt(1, 20));
        }
        return list;
    }
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
}
