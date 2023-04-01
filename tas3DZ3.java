// Задан целочисленный список ArrayList. Найти минимальное, 
// максимальное и среднее ариф. из этого списка 

import java.util.ArrayList;
import java.util.Random;

public class tas3DZ3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int lenArrList = 6;

        list.add(random.nextInt(-5,6));

        int sum, min, max;
        sum = min = max = list.get(0);

        for (int i = 1; i < lenArrList; i++) {
            list.add(random.nextInt(-5,6));
            sum += list.get(i);
            if (max < list.get(i))
                max = list.get(i);
            if (min > list.get(i))
                min = list.get(i);
        }
        System.out.println(list);
        System.out.printf("Сумма = %d\n",sum);
        System.out.printf("Среднее арифматическое %.2f\n", sum*1.0/list.size());
        System.out.printf("Максимальное число = %d\n", max);
        System.out.printf("Минимальное число = %d\n", min);

    }
}
