package jx;

/**
 * Created by mini on 2017/3/27.
 */
public class Test {
    public static void main(String[] args) {
        int month = 15;
        double all = 0;
        double interest = 0;
        for (int i = 1; i <= month; i++) {
            double each = 0;
            if (all <= 15) {
                each = all * 0.05;
            }else {
                each = all * 0.064;
            }
            interest += each;
            all += 2 + each;
            System.out.println("\nmonth: " + i + ",\nall: "+all + ",\ninterest: " + interest + ",\neach: " + each);
        }
        System.out.println(all);
    }
}
