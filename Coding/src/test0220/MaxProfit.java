package test0220;

//Say you have an array for which the ith element is the price of a given stock on day i.
//        Design an algorithm to find the maximum profit.
//        You may complete as many transactions as you like
//        (ie, buy one and sell one share of the stock multiple times).
//        However, you may not engage in multiple transactions at the same time
//        (ie, you must sell the stock before you buy again).
public class MaxProfit {
    public static int maxPro(int[] prices) {
        int i=0;
        int min=prices[0];
        int max=prices[0];
        int profit=0;
        while(i<prices.length-1){
            while (i<prices.length-1&&prices[i]>=prices[i+1]){
                i++;  }
                min=prices[i];
                while (i<prices.length-1&&prices[i]<=prices[i+1]){
                   i++;
                }
            max=prices[i];
                profit+=max-min;
        }
        return profit;
    }
    public static int method2(int[] a){
        int profit=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                profit+=a[i]-a[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        System.out.println(maxPro(new int[]{5,2,1,2,6}));
        System.out.println(method2(new int[]{5,2,1,2,6}));
    }
}
