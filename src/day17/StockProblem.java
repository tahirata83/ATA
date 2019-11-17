package day17;

public class StockProblem {
   // Best Time to Buy and Sell Stock
//    Say you have an array for which the ith element is the price of a given stock on day i.
//
//    If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//    Note that you cannot sell a stock before you buy one.
//
//            Example 1:
//
//    Input: [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Not 7-1 = 6, as selling price needs to be larger than buying price.
//    Example 2:
//
//    Input: [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transaction is done, i.e. max profit = 0.
   public static void main(String[] args) {
//        we need to use
//        use for loop
       //find out min number
       //found Max between max and price - min.
       int[] prices = new int[]{7, 1, 5, 3, 6, 4};

       //int min = prices[0];//pick any number inside the array
       int min = Integer.MAX_VALUE;
       int maxProfit = 0;
       for (int p : prices) {
           min = Math.min(min, p);
           int profit = p - min;
           maxProfit = Math.max(maxProfit, profit);
       }
       System.out.println(maxProfit);


//        for (int p = 0; p < prices.length; p++) {
////            System.out.println(prices[p]);
//            System.out.println(p);
//        }

   }








}
