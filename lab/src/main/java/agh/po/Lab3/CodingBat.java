package agh.po.Lab3;

public class CodingBat {

    //warmup
    boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday) {
            return true;
        }
        return vacation;
    }


    //warmup
    boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        }
        return !aSmile && !bSmile;
    }
    //array2
    int countEvents(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 ==0){
                count++;
            }
        }
        return count;
    }
    //string 1
    String helloName(String name) {
        return "Hello "+ name + "!";
    }
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        boolean b = cb.sleepIn(true, false);

        boolean b2 = cb.monkeyTrouble(true, false);

        int b3 = cb.countEvents(new int[]{2, 5, 6 ,1});

        String b4 = cb.helloName("ma");

    }
}
