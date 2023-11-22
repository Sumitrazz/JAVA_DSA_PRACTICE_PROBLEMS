public class BuyAndSell_stocks {
    public static int buyandSellStocks(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        System.out.println(buyPrice);
        for(int i=0; i<price.length; i++){
            if(buyPrice<price[i]){
                int profit= price[i]- buyPrice;
                maxProfit= Math.max(maxProfit, profit);
            } else{
                buyPrice=price[i];
            }
        } return maxProfit;
    } public static void main(String args[]){
        int price[]= {7,1,5,3,6,4};
        System.out.println(buyandSellStocks(price));
    }
}
