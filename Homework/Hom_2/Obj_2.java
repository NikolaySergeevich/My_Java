package Homework.Hom_2;



public class Obj_2 {
    public static void main(String[] args) {
        String[] mas = Fyncshion.arrStrFromFile(); //Создаёт массив, в котором в качестве каждого элемента лежит строка из файла
        for (String string : mas) {
            System.out.println(string);
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            Fyncshion.massivSplit(mas[i]);//Принимает строку, обрабатывает её и выводит нужный результат
            System.out.println();
        }
    }
}
