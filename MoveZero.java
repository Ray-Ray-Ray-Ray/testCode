import java.util.Arrays;

public class MoveZero {
   public static void main(String[] args) {
       System.out.println(Arrays.toString(TwoPointsMove(new int[] { 1, 0, 3, 0, 0, 5 })));
       
   }

   public static int[] TwoPointsMove(int[] arr) {
       int point1 = 0;
       int point2 = 0;
       while(point2 != arr.length){
        System.out.println("p1 "+point1+"p2 "+point2);
           if(arr[point2] != 0){
                  int n;
                  n = arr[point1];
                  arr[point1] = arr[point2];
                  arr[point2] = n;
                  point1++;
                  point2++;
            }else{
                point2++;
            }
            
       }
              
      
       return arr;
   }
}