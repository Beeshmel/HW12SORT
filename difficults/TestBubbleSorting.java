package difficults;

import java.util.Arrays;

public class TestBubbleSorting {
    public static int[] mySort(int myArr[]){
        for (int i = 1; i < myArr.length; i++) {
            for (int j = 0; j < myArr.length - 1; j++) {
                if(myArr[j] > myArr[j + 1]){
                    var temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        return myArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySort(new int[]{3,2,1,5,0})));
    }
}
