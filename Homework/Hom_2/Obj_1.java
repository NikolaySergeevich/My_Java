package Homework.Hom_2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Obj_1 {
    public static void main(String[] args) throws IOException {   
        Logger Logg = Logger.getLogger(Obj_1.class.getName());
        FileHandler fh = new FileHandler("D:\\Учёба в GB\\Java\\Курс на GB\\Homework\\Hom_2\\log.txt");
        Logg.addHandler(fh);
        SimpleFormatter sFor = new SimpleFormatter();
        fh.setFormatter(sFor);
        Logg.log(Level.WARNING, "Тестовое логирование 1");

        int[] arr = new int[] {5, 8, 3, 1, 9, 10, 2, 4};
        System.out.println("Стартовый массив:");
        StringBuilder startMas = massifT(arr);
            System.out.println(startMas);
        System.out.println();

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]){
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp; 
                }
            }
            // Logg.info("Вот текущиё массив");
            StringBuilder res = massifT(arr);
            System.out.println(res);
            sendStrInFile(res);

        }
    }
// --------------------------------------------------   методы ----------------
    public static StringBuilder massifT(int[] ar) {  //переводит массив int в строку StringBuilder
        String[] strArr = new String[ar.length];
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < ar.length; k++) {
            strArr[k] = String.valueOf(ar[k]);
                result.append(strArr[k]).append(" ");
            }
        return result;
    }

    public static void sendStrInFile(StringBuilder str) { // заносит строку StringBuilder в файл
        File file = new File("D:\\Учёба в GB\\Java\\Курс на GB\\Homework\\Hom_2\\log.txt");
        try{
            FileWriter writer = new FileWriter(file, true);
            
            writer.append(str);
            writer.append("\n");
                
            writer.close();
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }
}
