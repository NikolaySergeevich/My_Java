package Homework.Hom_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Fyncshion {
    public static void PaliandrText(String tex) {
        int sizeTex = tex.length();
        char left;
        char right;
        boolean flag = true;
        for (int i = 0; i < tex.length() / 2; i++) {
            left = tex.charAt(i);
            right = tex.charAt(sizeTex - 1 - i);
            if (left != right) {
                flag = false;
                break;
            }        
        }
        System.out.println(flag);
    }


    public static String[] arrStrFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Учёба в GB\\Java\\Курс на GB\\Homework\\Hom_2\\for_Obj_2.txt"))) {
            BufferedReader bpp = new BufferedReader(new FileReader("D:\\Учёба в GB\\Java\\Курс на GB\\Homework\\Hom_2\\for_Obj_2.txt"));
            String str;
            int sizeStr = 0;
            while ((str = br.readLine()) != null) {
                sizeStr ++;
            }
            br.close();
            String[] arr = new String[sizeStr];
            int count = 0;
            while ((str = bpp.readLine()) != null) {
                arr[count] = str;
                count ++;
            }
            bpp.close();           
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void massivSplit(String text) {
        String[] array = text.split("\"");
        StringBuilder res = new StringBuilder();
        res.append("Студент " + array[3] + " получил " + array[7] + " по предмету " + array[11]);
        System.out.println(res);
        
    }
}


