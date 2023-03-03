
// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in, "Cp866"); //Cp866 нужно, что бы русские буквы считывать
        System.out.print("Как вас зовут: ");
        String nam = name.nextLine();
        System.out.printf("Привет, %s", nam);
        name.close();
    }
}
