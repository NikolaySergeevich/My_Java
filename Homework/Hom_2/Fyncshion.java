package Homework.Hom_2;

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
}
