
public class earnMost {
   public static void main(String[] args) {
       int[] stock = new int[]{4, 7, 4, 3, 5,9,};
       System.out.println(earnMoney(stock));
       System.out.println(lowestPriceToEarn(stock));
   }

   public static int earnMoney(int[] prices) {
       int mostFee = 0;
       int currentFee = 0;
       for (int i = 0; i < prices.length; i++) {
           for (int j = i + 1; j < prices.length; j++) {
               if (prices[i] - prices[j] <= 0) {
                   currentFee = Math.abs(prices[i] - prices[j]);
               }
               if (currentFee > mostFee) {
                   mostFee = currentFee;
               }
           }
       }
       return mostFee;

   }

   
}