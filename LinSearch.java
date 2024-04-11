import java.util.Scanner;

public class LinSearch {
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
        var isFind = false;

        for (int i : arr) {
            if (i == item){
                isFind = true;
                System.out.println("Элемент найден");
                break;
            }
        }
        if(!isFind){
            System.out.println("Элемент не найден");
        }
        sc.close();
    }
}
