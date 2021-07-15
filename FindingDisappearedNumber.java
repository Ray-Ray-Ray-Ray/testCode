import java.util.ArrayList;
import java.util.List;

public class FindingDisappearedNumber {
    public static void main(String[] args) {
        System.out.println(checkNumber(new int[] { 1,2,2}));
    }

    public static List<Integer> checkNumber(int[] arr) {
        int n = arr.length;
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<n; j++){
                if(i == arr[j]){
                    break;
                }if(j == n-1){
                   res.add(i); 
                }
            }
            
            
        }
        return res;
    }
}