package dsa.slidingwindow;

public class BestTimeToPurchaseStock {

    public int maxProfit(int[] prices) {
        // int min = Integer.MAX_VALUE, profit = 0;
        // for (int i = 0; i < prices.length; i++) {
        // if (prices[i] < min) {
        // // if element in small then update min
        // min = prices[i];
        // } else {
        // //else we calculate profit, if current profit(prices[i]-min)>profit -> update
        // profit
        // profit = Math.max(prices[i] - min, profit);
        // }
        // }
        // return profit;

        int profit = 0;
        int min = Integer.MAX_VALUE, minIdx = -1, max = Integer.MIN_VALUE, maxIdx = -1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIdx = i;
                max = Integer.MIN_VALUE;
                maxIdx = -1;
            }
            if (i > minIdx && prices[i] > max) {
                max = prices[i];
                maxIdx = i;
            }

            int temp = max - min;
            if (max != Integer.MIN_VALUE && temp > profit) {
                profit = temp;
            }

        }
        return profit;
    }
}
