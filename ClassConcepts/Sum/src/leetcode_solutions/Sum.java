package leetcode_solutions;

import java.util.Arrays;

public class Sum {
    public int add(int... num) {
        return Arrays.stream(num).sum();
    }

    public double add(double... num) {
        return Arrays.stream(num).sum();
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.add(2, 3)); //output : 5
        System.out.println(sum.add(4, 9, 12));//output : 25
        System.out.println(sum.add(4, 5.0));//output : 9.0
        System.out.println(sum.add(15.5, 5));//output : 20.5
        System.out.println(sum.add(1.0, 6.4));//output : 7.4
    }
}
