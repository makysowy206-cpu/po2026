package agh.po.lab2;
import java.util.ArrayList;
import java.util.Arrays;
public class lotto{
    public static void main(String[] args) {
        // pobieranie od uzytkownika jego typow
        ArrayList<Integer> typy = new ArrayList<>();
        for(int i = 0; i < args.length;i++) {
            typy.add(Integer.parseInt(args[i]));
        }

        int licznik = 0;
        int hits;
        ArrayList<Integer> lotto;
        do {
            lotto = new ArrayList<>();
            while (lotto.size() <6) {
                int losowa = (int) (Math.random() * 49) + 1;
                if (!lotto.contains(losowa)) {
                    lotto.add(losowa);
                }
            }
            // porownanie tablic lotto oraz typy
            hits = 0;
            for(int i=0;i<lotto.size();i++){
                for(int j=0;j<typy.size();j++){
                    if(typy.get(j).equals(lotto.get(i))) {
                        hits=hits+1;
                    }
                }
            }
            licznik++;
        } while (hits < 6);

        System.out.println(lotto);
        System.out.println(typy);
        System.out.println(hits);
        System.out.println("Liczba losowan: " + licznik);
    }
}