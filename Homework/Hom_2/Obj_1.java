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

        File file = new File("D:\\Учёба в GB\\Java\\Курс на GB\\Homework\\Hom_2\\log.txt");
        



        int[] arr = new int[] {5, 8, 3, 1, 9, 10, 2, 4};
        System.out.println("Стартовый массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
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
            String[] strArr = new String[arr.length];
            StringBuilder result = new StringBuilder();
            for (int k = 0; k < arr.length; k++) {
            strArr[k] = String.valueOf(arr[k]);
                result.append(strArr[k]).append(" ");
            }
                
            System.out.println();
            Logg.info("Вот текущиё массив");
            try{
                FileWriter writer = new FileWriter(file, true);
                for(String item : strArr){
                    System.out.printf("%s ", item); //для наглядности в терминале
                }
                writer.append(result); //строка должна будет выводиться после Logg (49 строка)
                writer.append("\n");
                    
                writer.close();
            }
            catch (Exception e){
                System.out.println("Что то пошло не так");
            }
            result.delete(0, result.length());
                
            System.out.println();

        
        }

    }
}
