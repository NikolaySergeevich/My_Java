package Homework.Hom_6;

import java.util.Set;

public class Notebook {
    private String firm;
    private String type;
    private Double diagonal;
    private int sizeRAM;
    private String typeMemory;
    private int sizeMemory;
    private String os;

    public Notebook(String firm, String type, Double diagonal, int sizeRAM, String typeMemory, int sizeMemory,
            String os) {
        this.firm = firm;
        this.type = type;
        this.diagonal = diagonal;
        this.sizeRAM = sizeRAM;
        this.typeMemory = typeMemory;
        this.sizeMemory = sizeMemory;
        this.os = os;
    }

    public String getFirm() {
        return firm;
    }

    public String getType() {
        return type;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public int getSizeRAM() {
        return sizeRAM;
    }

    public String getTypeMemory() {
        return typeMemory;
    }

    public int getSizeMemory() {
        return sizeMemory;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        String res = new String();
        res += "\nФирма - ";
        res += getFirm();
        res += "\nТип ноутбука - ";
        res += getType();
        res += "\nДиагональ в дюймах - ";
        res += getDiagonal();
        res += "\nРазмер оперативной памяти - ";
        res += getSizeRAM();
        res += "ГБ";
        res += "\nТип накопителя памяти - ";
        res += getTypeMemory();
        res += "\nРазмер паямти - ";
        res += getSizeMemory();
        res += "ГБ";
        res += "\nОперациаонная система - ";
        res += getOs();
        return res;
    }

    // метод показа параметров ноутбука
    public void showNot() {
        System.out.println(toString());
    }

    // метод показа сета ноутбуков со всеми параметрами
    public static void showSet(Set<Notebook> lis) {
        for (Notebook ite : lis) {
            System.out.println(ite.toString());
        }
    }
}