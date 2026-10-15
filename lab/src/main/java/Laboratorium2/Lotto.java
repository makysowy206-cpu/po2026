package Laboratorium2;

import java.util.ArrayList;
public class Lotto{
    public static void main(String[] args) {
     ArrayList<Integer> lotto = new ArrayList<Integer>();
        while (lotto.size() <6) {
            int losowa = (int) (Math.random() * 49) + 1;
            if (!lotto.contains(losowa)) {
                lotto.add(losowa);
            }
        }
        System.out.println(lotto);
    }
}
