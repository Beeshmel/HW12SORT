import difficults.TestBubbleSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        int arr[] = null,size,item;
        var sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Введите искомый элемент");
        item = sc.nextInt();

        arr = TestBubbleSorting.mySort(arr);

        System.out.println(Arrays.toString(arr));

        var first = 0;//индекс с которого начинаем поиск
        var last = size - 1;//индекс, которым оканчиваем поиск
        search(arr,first,last,item);


    }

    private static void search(int[] arr, int first, int last, int item) {
        var position = (first + last) / 2;//получили индекс центрального элемента массива
        while (arr[position] != item && first <= last){
            if(arr[position] > item){//искомый элемент меньше элемента в центре
                last = position - 1;
            }else {
                first = position + 1;
            }
            position = (first + last) / 2;//центр половинчатого массива
        }
        if(first <= last){
            System.out.println("Элемен найден на " + (position + 1) + " месте");
        }else {
            System.out.println("Элемент не найден");
        }
    }


}
