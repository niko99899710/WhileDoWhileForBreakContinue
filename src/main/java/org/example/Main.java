package org.example;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("ЗАДАНИЕ 1");
        int a = 1;
        while (a <= 50) {
            a++;
            if (a % 5 == 0) {
                System.out.println(a);
            }
        }
    }
    public static void task2 () {
        System.out.println("ЗАДАНИЕ 2");
        int i, sum;
        for ( i = 1, sum = 0; i <= 100; i++) {
            System.out.println(sum);
            sum +=i;
        }
    }
}