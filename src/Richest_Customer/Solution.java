package Richest_Customer;


/*
Richest Customer Wealth

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (var e : accounts) {
            // int s = Arrays.stream(e).sum();
            int s = 0;
            for (int v : e) {
                s += v;
            }
            ans = Math.max(ans, s);
        }
        return ans;
    }
}
