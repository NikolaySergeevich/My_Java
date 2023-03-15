package Homework.Hom_4;

import java.util.Deque;
import java.util.Scanner;

public class funcahForColc {

    // метод считывания числа
    public static double givNum() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = scan.nextDouble();
        return num;
    }

    // метод добавления числа в очередь
    public static void addNumQeueu(Deque<Object> lis, double numb) {
        if (numb % 1 == 0) {
            int nu = (int)numb;
            lis.addLast(nu);
        }else{ lis.addLast(numb);}
    }

    // метод выбора операции
    public static char givOperstion() {
        System.out.println("Выберете и введите один из знаков: +, -, /, *\n"
        +"Или введите '`' что бы отменить последнее действие.");
        Scanner sc = new Scanner(System.in);
        char znnn = sc.next().charAt(0);
        return znnn;
    }


    // метод основной работы
    public static void operation(Deque<Object> lis) {
        while(!lis.isEmpty()){
            char numOper = givOperstion();
            mainOperation(lis, numOper);
        }
        
    }

    // метод выполнения операций
    public static void mainOperation(Deque<Object> lis, char zn) {
        switch (zn) {
            case '+':
                Object vrem = lis.getLast();
                double numNew = givNum();
                addNumQeueu(lis, numNew);
                Object vrem_v = lis.getLast();
                Object res = sum(vrem, vrem_v);
                // lis.addLast(res);
                addResInList(lis, res);
                System.out.println(lis);
                System.out.println("Это список всех чисел, с которыми производились"
        +" математические действия и их результаты");
                break;
            case '-':
                Object vre = lis.getLast();
                double numNe = givNum();
                addNumQeueu(lis, numNe);
                Object vremv = lis.getLast();
                Object re = diff(vre, vremv);
                // lis.addLast(re);
                addResInList(lis, re);
                System.out.println(lis);
                System.out.println("Это список всех чисел, с которыми производились"
        +" математические действия и их результаты");
                break;
            case '*':
                Object vr = lis.getLast();
                double numN = givNum();
                addNumQeueu(lis, numN);
                Object vrop = lis.getLast();
                Object repo = multi(vr, vrop);
                // lis.addLast(repo);
                addResInList(lis, repo);
                System.out.println(lis);
                System.out.println("Это список всех чисел, с которыми производились"
        +" математические действия и их результаты");
                break;
            case '/':
                Object vremeno = lis.getLast();
                double numNeew = givNum();
                addNumQeueu(lis, numNeew);
                Object vremennoe = lis.getLast();
                Object rep = segmen(vremeno, vremennoe);
                // lis.addLast(rep);
                addResInList(lis, rep);
                System.out.println(lis);
                System.out.println("Это список всех чисел, с которыми производились"
        +" математические действия и их результаты");
                break;
            case '`':
                escOperation(lis);
                break;
            default:
                System.out.println("такой операции нет.");
                break;
        }
    }

    // метод отмены
    public static void escOperation(Deque<Object> lis) {
        try {
            lis.removeLast();
        lis.removeLast();
        System.out.println(lis);
        System.out.println("Это список всех чисел, с которыми производились"
        +" математические действия и их результаты после отмены последней операции");
        } catch (Exception e) {
            System.out.println("Вы очистили всю историю вычислений");
        }
        
    }
    // методы +,-,*,/
    public static Object sum(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer){
            return (Object)((Integer)a + (Integer)b);
        }else if (a instanceof Double && b instanceof Double) {
            return (Object)((Double)a + (Double)b);
        }
        else if (a instanceof Integer && b instanceof Double){
            return (Object)((Integer)a + (Double)b);
        }
        else if (a instanceof Double && b instanceof Integer){
            return (Object)((Double)a + (Integer)b);
        }
        else return 0; 
    }
    public static Object diff(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer){
            return (Object)((Integer)a - (Integer)b);
        }else if (a instanceof Double && b instanceof Double) {
            return (Object)((Double)a - (Double)b);
        }
        else if (a instanceof Integer && b instanceof Double){
            return (Object)((Integer)a - (Double)b);
        }
        else if (a instanceof Double && b instanceof Integer){
            return (Object)((Double)a - (Integer)b);
        }
        else return 0; 
    }
    public static Object multi(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer){
            return (Object)((Integer)a * (Integer)b);
        }else if (a instanceof Double && b instanceof Double) {
            return (Object)((Double)a * (Double)b);
        }
        else if (a instanceof Integer && b instanceof Double){
            return (Object)((Integer)a * (Double)b);
        }
        else if (a instanceof Double && b instanceof Integer){
            return (Object)((Double)a * (Integer)b);
        }
        else return 0; 
    }
    public static Object segmen(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer){
            if ((Integer)a % (Integer)b != 0) {
                int p = (int)b;
                double po = (double)p;
                return (Object)((Integer)a / (Double)po);
            }else{
                return (Object)((Integer)a / (Integer)b);
            }
        }
        else if (a instanceof Double && b instanceof Double) {
            return (Object)((Double)a / (Double)b);
        }
        else if (a instanceof Integer && b instanceof Double){
            return (Object)((Integer)a / (Double)b);
        }
        else if (a instanceof Double && b instanceof Integer){
            return (Object)((Double)a / (Integer)b);
        }
        else return 0; 
    }

    // метод проверки результата вычислений на тип int или double
    // и в зависимости от типа дрбавит этот результат в конец очереди
    public static void addResInList(Deque<Object> lis, Object res) {
        if (res instanceof Double) {
            if((Double)res % 1 == 0){
                double loh = (double)res;
                int mjk = (int)loh;
                lis.addLast(mjk);
            }else{
                lis.addLast(res);
            }
        }
        else{
            lis.addLast(res);
        }
    }


}
