package Homework.Hom_4;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Obj_2 {
    public static void main(String[] args) {
        LinkedList<Integer> startList = funcshionaly.creatLinkedList();
        System.out.println(startList);
        funcshionaly.work(startList);  
    }
}
