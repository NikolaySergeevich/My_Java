package Homework.Hom_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class wor {
    public static void main(String[] args) {
        Notebook note_1 = new Notebook("Honor", "Ультрабук", 15.6, 8, "SSD", 512, "Windows");
        Notebook note_2 = new Notebook("Honor", "Игровой", 15.6, 16, "SSD", 512, "Windows");
        Notebook note_3 = new Notebook("Honor", "Игровой", 17.0, 16, "SSD", 1024, "Windows");
        Notebook note_4 = new Notebook("Lenovo", "Ультрабук", 15.6, 8, "SSD", 512, "Windows");
        Notebook note_5 = new Notebook("Lenovo", "Ультрабук", 14.0, 16, "SSD", 512, "Windows");
        Notebook note_6 = new Notebook("Lenovo", "Ноутбук начального уровня", 15.6, 4, "SSD", 256, "Windows");
        Notebook note_7 = new Notebook("Lenovo", "Ноутбук начального уровня", 15.6, 6, "SSD", 256, "Windows");
        Notebook note_8 = new Notebook("Lenovo", "Игровой", 15.6, 8, "SSD", 512, "Windows");
        Notebook note_9 = new Notebook("Lenovo", "Игровой", 17.0, 16, "SSD", 512, "Windows");
        Notebook note_10 = new Notebook("Asus", "Ноутбук начального уровня", 14.0, 4, "SSD", 256, "Windows");
        Notebook note_11 = new Notebook("Asus", "Игровой", 17.0, 16, "SSD", 1024, "Windows");
        Notebook note_12 = new Notebook("Asus", "Игровой", 15.6, 16, "SSD", 512, "Windows");
        Notebook note_13 = new Notebook("Asus", "Ультрабук", 15.6, 8, "SSD", 512, "Windows");
        Notebook note_14 = new Notebook("Tecno", "Ультрабук", 14.0, 6, "SSD", 512, "Linux");
        Notebook note_15 = new Notebook("Tecno", "Игровой", 17.0, 16, "SSD", 1024, "Linux");
        Notebook note_16 = new Notebook("Tecno", "Ноутбук начального уровня", 15.6, 4, "SSD", 512, "Linux");
        Notebook note_17 = new Notebook("Apple", "Ультрабук", 14.0, 8, "SSD", 512, "MacOS");
        Notebook note_18 = new Notebook("Apple", "Ультрабук", 14.0, 16, "SSD", 1024, "MacOS");
        Notebook note_19 = new Notebook("Apple", "Ультрабук", 14.0, 16, "SSD", 512, "MacOS");
        Notebook note_20 = new Notebook("Acer", "Ультрабук", 15.6, 8, "SSD", 512, "Windows");
        Notebook note_21 = new Notebook("Acer", "Игровой", 17.0, 16, "SSD", 1024, "Windows");
        Notebook note_22 = new Notebook("Acer", "Игровой", 15.6, 16, "SSD", 512, "Windows");
        Notebook note_23 = new Notebook("Acer", "Ноутбук начального уровня", 15.6, 6, "SSD", 256, "Windows");

        Set<Notebook> liNotebooks = new HashSet<>(Arrays.asList(note_1, note_2, note_3, note_4, note_5, note_6, note_7,
                note_8, note_9, note_10, note_11, note_12, note_13, note_14, note_15, note_16, note_17, note_18, note_19, note_20,
                note_21, note_22, note_23));
        Scanner scan = new Scanner(System.in);
        Info.hello();
        boolean flag = true;
        while (flag) {
            selectListNot(liNotebooks);
            System.out.println("\nНадеемся, что вы нашли то, что искали."
            +" Что бы продолжить поиски - введите любой символ.\nЧто бы закончить - введите 0");
            char num = scan.nextLine().charAt(0);
            switch (num) {
                case '0':
                    System.out.println("\nПриходите ещё. Мы обязательно подберём вам ноутбук!");
                    flag = false;
            }
        }

    }

    // -----------------------------------------------------------------------------------------------
    /**
     * метод показа всех марок, которые имеются в магазине
     * 
     * @param lis
     */
    public static void showFirmEntireNot(Set<Notebook> lis) {
        Set<String> individFirm = new HashSet<>();
        int i = 1;
        for (Notebook ite : lis) {
            individFirm.add(ite.getFirm());
        }
        for (String string : individFirm) {
            System.out.printf("\n%d - %s", i, string);
            i++;
        }
    }

    /**
     * метод показа всех типов, которые имеются в магазине
     * 
     * @param lis
     */
    public static void showTypeEntireNot(Set<Notebook> lis) {
        Set<String> individType = new HashSet<>();
        int i = 1;
        for (Notebook ite : lis) {
            individType.add(ite.getType());
        }
        for (String string : individType) {
            System.out.printf("\n%d - %s", i, string);
            i++;
        }
    }

    /**
     * метод показа всех имещихся диагоналей
     * 
     * @param lis
     */
    public static void showDiagonalEntireNot(Set<Notebook> lis) {
        Set<Double> individDiagonal = new HashSet<>();
        int i = 1;
        for (Notebook ite : lis) {
            individDiagonal.add(ite.getDiagonal());
        }
        for (double el : individDiagonal) {
            System.out.printf("\n%d - %.1f", i, el);
            i++;
        }
    }

    /**
     * метод показа с какими объёмами оперативной памяти есть ноутбуки
     * 
     * @param lis
     */
    public static void showSizeRAMEntireNot(Set<Notebook> lis) {
        Set<Integer> individSizeRAM = new HashSet<>();
        int i = 1;
        for (Notebook ite : lis) {
            individSizeRAM.add(ite.getSizeRAM());
        }
        for (int el : individSizeRAM) {
            System.out.printf("\n%d - %d ГБ", i, el);
            i++;
        }
    }

    /**
     * метод показа имеющихся типов памяти
     * 
     * @param lis
     */
    public static void showTypeMemoryEntireNot(Set<Notebook> lis) {
        Set<String> individTypeMemory = new HashSet<>();
        int i = 1;
        for (Notebook ite : lis) {
            individTypeMemory.add(ite.getTypeMemory());
        }
        for (String string : individTypeMemory) {
            System.out.printf("\n%d - %s", i, string);
            i++;
        }
    }

    /**
     * метод показа с какими объёмами 'рабочей' памяти есть ноутбуки
     * 
     * @param lis
     */
    public static void showSizeMemoryEntireNot(Set<Notebook> lis) {
        Set<Integer> individSizeMemory = new HashSet<>();
        int i = 1;
        for (Notebook ite : lis) {
            individSizeMemory.add(ite.getSizeMemory());
        }
        for (int el : individSizeMemory) {
            System.out.printf("\n%d - %d ГБ", i, el);
            i++;
        }
    }

    /**
     * метод поажет с какими операционными системами на борту имеются ноутбуки
     * 
     * @param lis
     */
    public static void showOSEntireNot(Set<Notebook> lis) {
        Set<String> individOS = new HashSet<>();
        int i = 1;
        for (Notebook ite : lis) {
            individOS.add(ite.getOs());
        }
        for (String string : individOS) {
            System.out.printf("\n%d - %s", i, string);
            i++;
        }
    }

    // -----------------------------------------------------------
    /**
     * Метод запрвшивает какой фирмы нужны ноутбуки и складывает их в отдельный Set
     * 
     * @param MainSetNoteb    - Set со всеми ноутбуками магазина
     * @param resultNotebooks - Set с ноутб. отфильтрованными по производителю
     */
    public static void chooseNotAboutFirm(Set<Notebook> MainSetNoteb, Set<Notebook> resultNotebooks) {
        Scanner scan = new Scanner(System.in);
        String noteBook = " ";
        boolean flag = true;
        showFirmEntireNot(MainSetNoteb);
        System.out.println("\nВыберите и введите номер подходящего ноутбука.\n"
                + "Если не выбрали, то введите 0(ноль).");
        int num = scan.nextInt();
        switch (num) {
            case 1: noteBook = "Lenovo";
                break;
            case 2: noteBook = "Honor";
                break;
            case 3: noteBook = "Acer";
                break;
            case 4: noteBook = "Apple";
                break;
            case 5: noteBook = "Tecno";
                break;
            case 6: noteBook = "Asus";
                break;
            case 0: flag = false;
                break;
            default:
                System.out.println("Ноутбуков других фирм у нас пока что нет.");
                flag = false;
                break;
        }
        if (flag) {
            for (Notebook no : MainSetNoteb) {
                if (no.getFirm().equals(noteBook)) {
                    resultNotebooks.add(no);
                }
            }
        }
    }

    /**
     * Метод запрвшивает какого типа нужны ноутбуки и складывает их в отдельный Set
     * 
     * @param MainSetNoteb    - Set со всеми ноутбуками магазина
     * @param resultNotebooks - Set с ноутб. отфильтрованными по типу
     */
    public static void chooseNotAboutType(Set<Notebook> MainSetNoteb, Set<Notebook> resultNotebooks) {
        Scanner scan = new Scanner(System.in);
        String noteBook = " ";
        boolean flag = true;
        showTypeEntireNot(MainSetNoteb);
        System.out.println("\nВыберите и введите номер подходящего ноутбука.\n"
                + "Если не выбрали, то введите 0(ноль).");
        int num = scan.nextInt();
        switch (num) {
            case 1:noteBook = "Ноутбук начального уровня";
                break;
            case 2:noteBook = "Игровой";
                break;
            case 3:noteBook = "Ультрабук";
                break;
            case 0:flag = false;
                break;
            default:
                System.out.println("Ноутбуков других типов у нас пока что нет.");
                flag = false;
                break;
        }
        if (flag) {
            for (Notebook no : MainSetNoteb) {
                if (no.getType().equals(noteBook)) {
                    resultNotebooks.add(no);
                }
            }
        }
    }

    /**
     * Метод запрвшивает какой диагонали нужны ноутбуки и складывает их в отдельный
     * Set
     * 
     * @param MainSetNoteb    - Set со всеми ноутбуками магазина
     * @param resultNotebooks - Set с ноутб. отфильтрованными по диагонали
     */
    public static void chooseNotAboutDiagonal(Set<Notebook> MainSetNoteb, Set<Notebook> resultNotebooks) {
        Scanner scan = new Scanner(System.in);
        Double noteBook = 0.1;
        boolean flag = true;
        showDiagonalEntireNot(MainSetNoteb);
        System.out.println("\nВыберите и введите номер подходящего ноутбука.\n"
                + "Если не выбрали, то введите 0(ноль).");
        int num = scan.nextInt();
        switch (num) {
            case 1:noteBook = 17.0;
                break;
            case 2:noteBook = 15.6;
                break;
            case 3:noteBook = 14.0;
                break;
            case 0:flag = false;
                break;
            default:
                System.out.println("Ноутбуков с  другими диагоналями у нас пока что нет.");
                flag = false;
                break;
        }
        if (flag) {
            for (Notebook no : MainSetNoteb) {
                if (no.getDiagonal().compareTo(noteBook) == 0) {
                    resultNotebooks.add(no);
                }
            }
        }
    }

    /**
     * Метод запрвшивает с каким объёмом памяти нужны ноутбуки и складывает их в
     * отдельный Set
     * 
     * @param MainSetNoteb    - Set со всеми ноутбуками магазина
     * @param resultNotebooks - Set с ноутб. отфильтрованными по объёму памяти
     */
    public static void chooseNotAboutSizeRAM(Set<Notebook> MainSetNoteb, Set<Notebook> resultNotebooks) {
        Scanner scan = new Scanner(System.in);
        Integer noteBook = 0;
        boolean flag = true;
        showSizeRAMEntireNot(MainSetNoteb);
        System.out.println("\nВыберите и введите номер подходящего ноутбука.\n"
                + "Если не выбрали, то введите 0(ноль).");
        int num = scan.nextInt();
        switch (num) {
            case 1:noteBook = 16;
                break;
            case 2:noteBook = 4;
                break;
            case 3:noteBook = 6;
                break;
            case 4:noteBook = 8;
                break;
            case 0:flag = false;
                break;
            default:
                System.out.println("Ноутбуков  с другими характеристиками у нас пока что нет.");
                flag = false;
                break;
        }
        if (flag) {
            for (Notebook no : MainSetNoteb) {
                if (no.getSizeRAM() == noteBook) {
                    resultNotebooks.add(no);
                }
            }
        }
    }

    /**
     * Метод запрвшивает с каким типом накопителя памяти нужны ноутбуки и складывает
     * их в отдельный Set
     * 
     * @param MainSetNoteb    - Set со всеми ноутбуками магазина
     * @param resultNotebooks - Set с ноутб. отфильтрованными по типу накопителя
     *                        памяти
     */
    public static void chooseNotAbouttypeMemory(Set<Notebook> MainSetNoteb, Set<Notebook> resultNotebooks) {
        Scanner scan = new Scanner(System.in);
        String noteBook = " ";
        boolean flag = true;
        showTypeMemoryEntireNot(MainSetNoteb);
        System.out.println("\nВыберите и введите номер подходящего ноутбука.\n"
                + "Если не выбрали, то введите 0(ноль).");
        int num = scan.nextInt();
        switch (num) {
            case 1:noteBook = "SSD";
                break;
            case 0:flag = false;
                break;
            default:
                System.out.println("Ноутбуков с другими типами накопителей у нас пока что нет.");
                flag = false;
                break;
        }
        if (flag) {
            for (Notebook no : MainSetNoteb) {
                if (no.getTypeMemory().equals(noteBook)) {
                    resultNotebooks.add(no);
                }
            }
        }
    }

    /**
     * Метод запрвшивает с каким типом накопителя памяти нужны ноутбуки и складывает их в отдельный Set
     * 
     * @param MainSetNoteb    - Set со всеми ноутбуками магазина
     * @param resultNotebooks - Set с ноутб. отфильтрованными по объёму памяти
     */
    public static void chooseNotAboutSizeMemory(Set<Notebook> MainSetNoteb, Set<Notebook> resultNotebooks) {
        Scanner scan = new Scanner(System.in);
        Integer noteBook = 0;
        boolean flag = true;
        showSizeMemoryEntireNot(MainSetNoteb);
        System.out.println("\nВыберите и введите номер подходящего ноутбука.\n"
                + "Если не выбрали, то введите 0(ноль).");
        int num = scan.nextInt();
        switch (num) {
            case 1:noteBook = 512;
                break;
            case 2:noteBook = 256;
                break;
            case 3:noteBook = 1024;
                break;
            case 0:flag = false;
                break;
            default:
                System.out.println("Ноутбуков с другими объёмом памяти у нас пока что нет.");
                flag = false;
                break;
        }
        if (flag) {
            for (Notebook no : MainSetNoteb) {
                if (no.getSizeMemory() == noteBook) {
                    resultNotebooks.add(no);
                }
            }
        }
    }
    /**
     * Метод запрвшивает с какой операционной системой нужны ноутбуки и складывает их в отдельный Set
     * @param MainSetNoteb - Set со всеми ноутбуками магазина
     * @param resultNotebooks - Set с ноутб. отфильтрованными по операциооным системам
     */
    public static void chooseNotAboutOS(Set<Notebook> MainSetNoteb, Set<Notebook> resultNotebooks) {
        Scanner scan = new Scanner(System.in);
        String noteBook = " ";
        boolean flag = true;
        showOSEntireNot(MainSetNoteb);
        System.out.println("\nВыберите и введите номер подходящего ноутбука.\n"
                + "Если не выбрали, то введите 0(ноль).");
        int num = scan.nextInt();
        switch (num) {
            case 1:noteBook = "Linux";
                break;
            case 2:noteBook = "MacOS";
                break;
            case 3:noteBook = "Windows";
                break;
            case 0:flag = false;
                break;
            default:
                System.out.println("Ноутбуков с другими операционными системами у нас пока что нет.");
                flag = false;
                break;
        }
        if (flag) {
            for (Notebook no : MainSetNoteb) {
                if (no.getOs().equals(noteBook)) {
                    resultNotebooks.add(no);
                }
            }
        }
    }
    // ------------------------------------------------------------
    /**
     * Метод собирающий критерии поска. Выводит итоговый результат
     * @param ListNot - Set со всеми ноутбуками магазина
     */
    public static void selectListNot(Set<Notebook> ListNot) {
        Set<Notebook> liNotebooksFirm = new HashSet<>();
        Set<Notebook> liNotebooksType = new HashSet<>();
        Set<Notebook> liNotebooksDiagonal = new HashSet<>();
        Set<Notebook> liNotebooksSizeRAM = new HashSet<>();
        Set<Notebook> liNotebooksTypeMemory = new HashSet<>();
        Set<Notebook> liNotebooksSizeMemory = new HashSet<>();
        Set<Notebook> liNotebooksOs = new HashSet<>();
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        while (flag) {
            Info.options();
            System.out.println("Введите номер параметра из имеющихся. Получить результат поиска - введите 0.");
            try {
                int num = scan.nextInt();
            switch (num) {
                case 1: chooseNotAboutFirm(ListNot, liNotebooksFirm);
                    break;
                case 2: chooseNotAboutType(ListNot, liNotebooksType);
                    break;
                case 3: chooseNotAboutDiagonal(ListNot, liNotebooksDiagonal);
                    break;
                case 4: chooseNotAboutSizeRAM(ListNot, liNotebooksSizeRAM);
                    break;
                case 5: chooseNotAbouttypeMemory(ListNot, liNotebooksTypeMemory);
                    break;
                case 6: chooseNotAboutSizeMemory(ListNot, liNotebooksSizeMemory);
                    break;
                case 7: chooseNotAboutOS(ListNot, liNotebooksOs);
                    break;
                case 0:
                    flag = false;
                default:
                    System.out.println(
                            "К сожалению у нас больше нет характеристик ноутбуков, по которым вы могли бы более"
                                    + " точно подобрать себе устройство.\nНо совсем скоро мы это исправим.");
                    break;
            }
                
            } catch (Exception e) {
                System.out.println("ВЫ ВВЕЛИ НЕ КОРЕКТНЫЕ ДАННЫЙ!");
                break;
            }
            
            if (flag) {
                System.out.println("\nВаши желания учтены. Дальше вы можете добавить ещё параметры для подбора "
                    + "ноутбука или получить результат.");
            }
            
        }
        FinalSort(ListNot, liNotebooksFirm, liNotebooksType, liNotebooksDiagonal, liNotebooksSizeRAM, liNotebooksTypeMemory, liNotebooksSizeMemory,
                    liNotebooksOs);    
    }
    /**
     * Компанует множества Set-ов через пересечениее множест.
     * Выводит итоговый результат по заданым критериям поиска.
     * @param Firm - Set, в котором лежат ноутбуки с выбранными параметрами фирмы
     * @param Type - Set, в котором лежат ноутбуки с выбранными параметрами по типам
     * @param Diagonal - Set, в котором лежат ноутбуки с выбранными параметрами по диагонали
     * @param SizeRAM - Set, в котором лежат ноутбуки с выбранными параметрами объёма оперативной памяти
     * @param TypeMemory - Set, в котором лежат ноутбуки с выбранными параметрами типа памяти
     * @param SizeMemory - Set, в котором лежат ноутбуки с выбранными параметрами объёма памяти
     * @param Os - Set, в котором лежат ноутбуки с выбранными параметрами по операционным системам
     */
    public static void FinalSort(Set<Notebook> MainNotSet, Set<Notebook> Firm, Set<Notebook> Type, Set<Notebook> Diagonal, Set<Notebook> SizeRAM, Set<Notebook> TypeMemory, 
    Set<Notebook> SizeMemory, Set<Notebook> Os) {
        LinkedList<Set<Notebook>> all = new LinkedList<>(Arrays.asList(Firm, Type, Diagonal, SizeRAM,  TypeMemory, SizeMemory, Os));
        for (int i = 0; i < all.size() - 1; i++) {
            if (i == all.size() - 2 && all.get(i).isEmpty()) {
                if (!Os.isEmpty()) {
                    Notebook.showSet(Os);
                }else {
                    System.out.println("\n\nВы не задали ни одного параметра для поиска.\n"
                    +"Вот полный списаок ноутбуков:\n=============================");
                    Notebook.showSet(MainNotSet);
                }
            }
            if (!all.get(i).isEmpty()) {
                for (int j = i+1; j < all.size(); j++) {
                    if (!all.get(j).isEmpty()) {
                        all.get(i).retainAll(all.get(j));
                    }
                }
                if (all.get(i).isEmpty()) {
                    System.out.println("\nПо такому запросу ноутбуков не найдено");
                }
                System.out.println("\nРЕЗУЛЬТАТ ПОИСКА:\n==================");
                Notebook.showSet(all.get(i));
                break;
            }
        }  
    }
}