public class Main1 {
    public static void main(String[] args) {
        Cat1 koks = new Cat1("Кокс", 7, "кот");
        System.out.println(koks.toString());
        koks.setColor("Рыжий");
        koks.setWeight(6);
        System.out.println(koks.toString());
        koks.vac();
        System.out.println(koks.toString());
        vac(koks);
        System.out.println(koks.toString());
        koks.meow(5);

        Cat1 noname = new Cat1();
        System.out.println(noname.toString());

    }

    public static void vac(Cat1 cat){
        if (!cat.isVaccine()){
            cat.setVaccine(true);
        }
        else System.out.println("Кот уже привит");
    }
}