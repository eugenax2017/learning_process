import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main22 {
    public static void main(String[] args) {
        String[] str1 = {"Str1", "Str2", "Str3"};
        String[] str2 = {"Str4", "Str2", "Str5"};
        ArrayList<String> arrL = new ArrayList<>();
        for (String s: str1) {
            if (arrL.indexOf(s)<0) {
                arrL.add(s);
            }
        }
        for (String s: str2) {
            if (arrL.indexOf(s)<0) {
                arrL.add(s);
            }
        }
        System.out.println(Arrays.toString(arrL.toArray()));
        List<String> arrL2 = new ArrayList<>();
        for (String s: str1) {
            if (arrL2.indexOf(s)<0) {
                arrL2.add(s);
            }
        }
        for (String s: str2) {
            if (arrL2.indexOf(s)<0) {
                arrL2.add(s);
            }
        }
        System.out.println(Arrays.toString(arrL2.toArray()));
    }
}
