import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main20 {
    private static void uniteArr(List<String> arr3, String[] arr1){
        for (String s : arr1){
            arr3.add(s);
        }

    }

    public static void main(String[] args) {
        int k=0;
        String[] str1 = {"Str1", "Str2", "Str3"};
        String[] str2 = {"Str4", "Str2", "Str5"};
        List<String> str3List = new ArrayList<>();
        uniteArr(str3List, str1);
        uniteArr(str3List, str2);
        List<String> str3ArrL = str3List;
        System.out.println(str3ArrL.getClass());
        Iterator<String> myIterator = str3List.iterator();
        while (myIterator.hasNext()) {
            String bValue = myIterator.next();
            if (bValue.equals("Str2")) {
                //System.out.println(myIterator.getClass());
                myIterator.remove();
            }
//                myIterator.remove();
//            }
        }
        System.out.println(Arrays.toString(str3List.toArray()));
    }
}
   // Scytl Регион компании Barcelona, ES
// Ctrl + Alt + T