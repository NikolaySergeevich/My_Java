import java.util.ArrayList;
import java.util.Random;
// заполнить ArrayList числами и строками. Пройтись по списку и удалить все числа
public class task_3 {
    public static void main(String[] args) {
        ArrayList mixList = new ArrayList<>();
        String[] words = new String[] {"нового", "всякого", "много", "тут"};
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            int fox = rnd.nextInt(0, 2);
            if(fox == 0){
                mixList.add(words[rnd.nextInt(words.length)]);
            }
            else{
                mixList.add(rnd.nextInt(0, 10));
            }
        }
        System.out.println(mixList);
        // for (int i = 0; i < mixList.size(); i++) {
        //     if(mixList.get(i) instanceof Integer){
        //         mixList.remove(i);
        //         i--;
        //     }
        // }

// оба цикла рыбочие

        for (int i = mixList.size() - 1; i >= 0; i--) {
            if(mixList.get(i) instanceof Integer){
                mixList.remove(i);
            }
        }

        System.out.println(mixList);
    }
}
