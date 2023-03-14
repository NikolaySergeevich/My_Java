package Homework.Hom_4;

import java.util.LinkedList;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class Obj_1 {
    public static void main(String[] args) {
        LinkedList<Integer> starList = funcshionaly.creatLinkedList();
        System.out.println(starList);
        LinkedList<Integer> finishList = funcshionaly.givFinishList(starList);
        System.out.println(finishList);
        
    }
}
