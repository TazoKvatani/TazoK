public class Main {
    // method to find unique int in array where all ints are duplicated except one
    static int singleNumber(int[] nums){
        int singleNum=0;  //variable which will hold unique int
        int counter; //counter variable
        for (int num : nums) { //looping through ints
            counter = 0;//reset counter to zero
            for (int i : nums) {//looping through array to compare all ints in array with current int
                if (num == i) {//if matching int for current int is found counter is increased
                    counter++;
                }
            }
            if (counter == 1) { //if counter is 1 it means current int only has matched once.it does not have duplicate in array
                singleNum = num;   //set singleNum to current int
            }
        }
        return singleNum;//return unique int
    }


    public static void main(String[] args) {
        int[] arr={1,2,11,1,2,3,3,4,4,5,5,6,6};//example array
        System.out.println(singleNumber(arr));//print unique array

    }
}