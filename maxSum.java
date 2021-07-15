import java.util.Arrays;

public class maxSum {
  public static void main(String[] args) {
      System.out.println(caculateSum(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
  }

  public static int caculateSum(int[] arr) {
      int maxValue = arr[0];
      int preValue= 0;
      int[] maxArr = new int[6];
      int j = 0;
      int n = 0;
      for(int i : arr){
          j++;
         preValue = Math.max(preValue + i, i);
         maxValue = Math.max(preValue, maxValue);
         if(preValue > maxValue){
           n = j;
         }


      }
      for(int m = 0; m<n;m++){
          maxArr[m] = arr[m];
      }
      System.out.println(Arrays.toString(maxArr));
      return maxValue;
  }
}