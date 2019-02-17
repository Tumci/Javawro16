package pl.com.sda.rafal.zientara.apps.lesson1.homework.delta.refactor;

public class DeltaCounter {
    int a;
    int b;
    int c;

    public DeltaCounter() {
    }

    public DeltaCounter(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int countDelta() {
        return ((int) Math.pow(b, 2)) - (4 * a * c);
    }

    public double[] getZeros() {
        int delta = countDelta();
        if (delta > 0) {
            return deltaPositive(delta);
        } else if (delta == 0) {
            return deltaZero();
        } else {
            System.out.println("Delta is negative.");
            return new double[0];
        }
    }

    public double[] deltaPositive(int delta) {
        double x1 = ((-1 * b) - (Math.sqrt(delta))) / (2 * a);
        double x2 = ((-1 * b) + (Math.sqrt(delta))) / (2 * a);

        System.out.println(String.format("x1= %.3f\nx2= %.3f", x1, x2));
        return new double[]{x1, x2};
    }

    public double[] deltaZero() {
        double x1 = (-1 * b) / (2 * a);
        System.out.println(String.format("x1= %.3f", x1));
        return new double[]{x1};
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}