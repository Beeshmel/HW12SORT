package difficults;

public class TestDifficult {
//    O(1)
    int getValue(int mas[]){
        return mas.length;
    }

    //O(N)
    int getSum(int arr[]){
        int s = 0;  //O(1)
        for (int item : arr) { //O(n)
            s += item;
        }
        return s;//(1)
    }
//    O(1) + O(n) + O(1) = O(1 + n + 1) = O(n + 2) = O(n)

//    O(n^2)
    boolean isDublicate(int arr[]){
        for (int i = 0; i < arr.length; i++) { //O(N)
            for (int j = 0; j < arr.length / 2; j++) {//O(N / 2)
                if(i != j){
                    if(arr[i] == arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
