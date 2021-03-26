package by.it.kaminskii.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }

    private static void step1() {
        double x = 0.3;
        double a = 756.13;
        double part1 = cos(pow(x * x + PI / 6, 5));
        double part2 = sqrt(x * pow(a, 3));
        double part3 = log((a - 1.12 * x) / 4);
        double z = part1 - part2 - part3;
        System.out.printf("при a=%-10.3f x=%f z=%f\n", a, x, z);
    }

    public static void step2() {
        double a = 1.21;
        double b = 0.371;
        double y = tan((a + b) * (a + b)) - pow((a + 1.5), 1.0 / 3) + a * pow(b, 5) - b / Math.log(a * a);
        System.out.println("y=" + y);
    }

    private static void step3() {
        double x = 12.1;
        for (double a = -5; a <= 12; a += 3.75) {
            double f = exp(a * x) - 3.45 * a;
            System.out.printf("При а=%6.2f f=%g\n", a, f);

        }
    }
}
