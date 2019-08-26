import java.util.Arrays;

class Main2 {
    public void swapEl(int[] arr, int i1, int i2) {
        int aux = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = aux;
    }
    public void mySort(int arr[]){
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i=1; i<arr.length; i++) {
                if (arr[i]<arr[i-1]) {
                    swapEl(arr, i, i-1);
                    needIteration = true;
                }
            }

        }
    }
    }
public class Main {
    public static void main(String[] args) {
        //сортировка методом вставок
        int[] arr = {5,8,5,78,100,-6,0};
        int[] arr2 = new int[]{5,6,7,8};
        Main2 mainObj = new Main2();
        mainObj.mySort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
class Main3 extends Main {

}