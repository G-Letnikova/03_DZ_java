// дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class task2DZ3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i= 0; i < 15; i++)
            list.add(rand.nextInt(100));

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next()%2 == 0) 
                iterator.remove();
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
        System.out.println(list);
    }
}
