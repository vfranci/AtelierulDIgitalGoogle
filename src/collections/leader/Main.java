package collections.leader;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int maxValue=-1;
        List<Integer> lists = new ArrayList<>();
        List<Integer> leaders = new ArrayList<>();
        lists.add(2);
        lists.add(9);
        lists.add(6);
        for(int i=lists.size()-1; i>=0; i--){
            int currentValue = lists.get(i);
            if (currentValue > maxValue) {
                maxValue = currentValue;
                leaders.add(currentValue);
            }
        }
        System.out.println(leaders);
    }
}
