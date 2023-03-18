package Homework.Hom_5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class fyncshion_for_1_obj {
    // метод добавления контакта
    public static void addContact(HashMap<String, LinkedList<Integer>> spr) {
        String name = writeName();
        LinkedList<Integer> lisNum = writeNumber();
        if (spr.containsKey(name)) {
            addNextNum(spr, lisNum, name);
        }else spr.putIfAbsent(name, lisNum);
    }

    // метод возвращающий фамилию
    public static String writeName() {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.println("Введите фамилию");
        String name = scan.nextLine();
        return name;
    }

    // метод возвращающий номер телефона в linkedList <int>
    public static LinkedList<Integer> writeNumber() {
        LinkedList<Integer> num = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер телефона");
        int number = scan.nextInt();
        num.add(number);
        return num;
    }

    // метод показа справочника
    public static void showSpravochnic(HashMap <String, LinkedList<Integer>> spr) {
        for (var item : spr.entrySet()) {
            System.out.printf("%s: ", item.getKey());
            printList(item.getValue());
        }
    }
    // метод, который принимает LinkedList<int> и печататет его
    public static void printList(LinkedList<Integer> lis) {
        for (Integer integer : lis) {
            System.out.printf("%d ", integer);
        }
        System.out.println();
    }
    // метод добавления второго номера
    public static void addNextNum(HashMap<String, LinkedList<Integer>> spr, LinkedList<Integer> lis, String name) {
        int newnumber = lis.get(0);
        LinkedList<Integer> valueFromMap = spr.get(name);
        valueFromMap.add(newnumber);
        spr.put(name, valueFromMap);
    }
    // Метод приветствия
    public static void Hallo() {
        System.out.println("Здравствуйте, вы отклыли телефонную книгу.\n"
        +"Ознакомтесь и введите номер подходящей функции.");
        help();
    }

    // метод описания функций справочника
    public static void help() {
        System.out.println("1 - добавить контакт. При попытке добавления существующего контакта\n"
        +"    номер будет просто добавлен.\n2 - показать телефонную книгу.\n"
        +"3 - показать справку с возможностями книги.\n"
        +"0 - закончить работу с книгой.");
    }

    
    public static int givNum() {
        Scanner sc = new Scanner(System.in);
        int num = 3;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели некоркктные данные.");
        }
        return num;
    }




}
