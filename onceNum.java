import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class onceNum {
    public static void main(String[] args) {
        String as ="this is dev branch";
        int[] s = new int[] { 2, 2, 3, 3, 1, 1, 5 };
        System.out.println(judgeOnce(s));
        System.out.println(singleNumber(s));
    }

    public static int judgeOnce(int[] arr) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int time = 0;
        for (int num : arr) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }
        Iterator iter = hashMap.keySet().iterator();
        while (iter.hasNext()) {
            int once = (int) iter.next();
            time = hashMap.get(once);
            if (time == 1) {
                System.out.println("the number only apeared once");
                return once;

            }
        }
        System.out.println("can not find this number");
        return 1;
    }
    // all numbers in array only have two times
    public static int singleNumber(int[] arr) {
        int single = 0;
        for(int num : arr){
            single ^= num; 
        }
        return single;
    }
}