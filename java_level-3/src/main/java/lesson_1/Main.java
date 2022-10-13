package lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*AccountInt accountInt1 = new AccountInt(100);
        AccountInt accountInt2 = new AccountInt(200);

        System.out.println(accountInt1.getCount());
        System.out.println(accountInt2.getCount());*/

        /*AccountUniversal a1 = new AccountUniversal(100);
        AccountUniversal a2 = new AccountUniversal(200.0);
        AccountUniversal aString = new AccountUniversal("300");

        System.out.println(a2.getCount());

        int x = (Integer) a1.getCount();
        int y = (Integer) a2.getCount();*/

        /*Account<Integer> integerAccount = new Account<>(200);
        Account<Double> doubleAccount = new Account<>(300.0);
        Account<String> stringAccount = new Account<>("232");

        System.out.println(integerAccount.info() + " " + integerAccount.getCount());
        System.out.println(doubleAccount.info() + " " + doubleAccount.getCount());
        System.out.println(stringAccount.info() + " " + stringAccount.getCount());

        Integer x = integerAccount.getCount();
        Double y = doubleAccount.getCount();

        List<String> list = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();*/

        Stats<Double> stats1 = new Stats<>(new Double[]{1.0, 2.0, 3.0});
        Stats<Double> stats2 = new Stats<>(new Double[]{1.0, 2.2, 3.0});
        System.out.println(stats1.sameAvg(stats2));

        Stats<Integer> integerStats = new Stats<>(new Integer[]{1, 2, 3});

        System.out.println(stats1.sameAvg(integerStats));
    }
}
