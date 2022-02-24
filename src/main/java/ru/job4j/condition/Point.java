package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x1 - x2;
        double two = y2 - y1;
        double three = Math.pow(one, 2);
        double four = Math.pow(two, 2);
        double five = three + four;
        double six = Math.sqrt(five);
        double rsl = six;
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(10, 1, 2, 5);
        double result2 = Point.distance(33, 4, 21, 10);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (10, 1) to (2, 5) " + result1);
        System.out.println("result (33, 4) to (21, 10) " + result2);
    }
}
