// сортировка слиянием

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1DZ3 {
    public static void main(String[] args) {
        System.out.print("Введите длинну массива: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();

        int[] arr = new int[len];
        Random rand = new Random();

        for (int i= 0; i < arr.length; i++)  
            arr[i] = rand.nextInt(11);

        System.out.println(Arrays.toString(arr));

        mergeSort(arr);
    
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr) {
        int lenArr = arr.length;
        
        if (lenArr == 1)
        return;

        int mid = lenArr/2;
        int[] left = new int[mid];
        int[] right = new int [lenArr-mid];


        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, (lenArr-mid));


        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);

    }

    private static void merge(int[] arr, int[] leftArr, int[] rigthArr) {
        int lenLeft = leftArr.length;
        int lenRight = rigthArr.length;
        int indexLeft = 0;
        int indexRigth = 0;
        int idx = 0;

        while (indexLeft<lenLeft && indexRigth<lenRight) {
            if (leftArr[indexLeft] < rigthArr[indexRigth])
                arr[idx++] = leftArr[indexLeft++];
            else 
                arr[idx++] = rigthArr[indexRigth++];
            
        }

        for (int ll = indexLeft; ll < lenLeft; ll++) 
            arr[idx++] = leftArr[ll];
        for (int rr = indexRigth; rr < lenRight; rr++) 
            arr[idx++] = rigthArr[rr];    
            
    }
}
