class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int chocolatePurchased1=0;
        int chocolatePurchased2=0;
        int sumPrices=0;
       PriorityQueue<Integer> choclatePrices = new PriorityQueue<Integer>();
        
        for(int i=0;i<prices.length;i++){
            choclatePrices.add(prices[i]);
        }
        
       
        chocolatePurchased1=choclatePrices.poll();
        chocolatePurchased2=choclatePrices.poll();
            sumPrices=chocolatePurchased1+chocolatePurchased2;
            if(sumPrices<=money){
            money=money-sumPrices;
         }
            
        
        return money;
        
       }
   }