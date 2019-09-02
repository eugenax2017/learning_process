import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        Arrays.sort(arr);
        //List<int[]> arrL = Arrays.asList(arr);
        List<String> arrL = new ArrayList<>();
        String[] names = {"Buenos Aires", "Córdoba", "La Plata"};
        ArrayList<String> places = new ArrayList<>(Arrays.asList(names));
        System.out.println(places);
        System.out.println(Arrays.toString(arr));
    }
}
class Main3 extends Main {

}