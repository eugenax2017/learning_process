import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int dim = sc.nextInt();
        while (k < dim) {
            int val = a + (int)(Math.random()*b);
            list.add(val);
            k++;
        }
        try {
            Integer maxSum = list.get(0) + list.get(1);
            for (int i=0; i<list.size(); i++){
                for (int j=i+1; j<list.size(); j++){
//                    if (i==j) {
//                        continue;
//                    }
                    Integer nextVal = list.get(i) + list.get(j);
                    if (maxSum<nextVal){
                        maxSum = nextVal;
                    }
                }

            }
            System.out.println(maxSum);

        }
        catch (Exception e){
            throw new OutOfMemoryError("Что-то пошло не так!");
        }
        finally {
            System.out.println("Но мы докатились до finally!");
        }
        System.out.println(Arrays.toString(list.toArray()));
    }



}
