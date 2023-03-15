public class Main {
    static int minSplit(int amount){//method to split your amount of money into minimum amount of coins
        int[] coins={50,20,10,5,1};//array for available coins
        int minAmountOfCoins=0;//assign amount of coins as 0
        int counter=0;//counter for iterating through array
        while(amount!=0){
            if(amount>=coins[counter]){//check if coin can be subtracted from amount of money without being less than zero
                amount=amount-coins[counter];//updating amount of money
                minAmountOfCoins++; //increment minAmountOfCoins when a coin is used
            } else {
                counter++; //move to the next coin if the current coin is too large
            }
        }
        return minAmountOfCoins;//returning amount of coins
    }
    public static void main(String[] args) {
        System.out.println(minSplit(31));//printing value
        System.out.println(minSplit(55));//printing value
    }
}
