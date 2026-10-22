package agh.po.Lab3;

public class CodingBat {
//warmup
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday) {
            return true;
        }
        if (vacation) {
            return true;
        }
        return false;
    }


//warmup
  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        }
        if(!aSmile && !bSmile) {
            return true;
        }
        return false;
  }
//array2
  public static int countEvents(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 2 ==0){
                count++;
            }
        }
        return count;
  }
//string 1
  public static String helloName(String name) {
        return "Hello "+ name + "!";
  }
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false)); // true
        System.out.println(sleepIn(true, false));  // false
        System.out.println(sleepIn(false, true));  // true
        System.out.println(" ");
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(" ");
        System.out.println(countEvents(new int[]{2, 5, 6 ,1}));
        System.out.println(countEvents(new int[]{2, 4, 6, 8}));
        System.out.println(countEvents(new int[]{9, 7, 3, 1}));
        System.out.println(" ");
        System.out.println(helloName("maks"));
        System.out.println(helloName("ma"));
        System.out.println(helloName("ks"));
    }
}



