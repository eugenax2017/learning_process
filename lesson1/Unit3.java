package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;


public class Unit3 {
    public List<String> copyAndSortList(List<String> original){
        List<String> list = new ArrayList<String>(original);
        sort(list);
        return list;

    }
}
