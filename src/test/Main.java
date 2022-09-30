package test;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Домашнее задание 1.1");

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        //System.out.println("Домашнее задание 1.2");
        double[] b = {1.57, 7.654, 9.986};
        // System.out.println("Домашнее задание 1.3");
        int[] c = new int[5];
        System.out.println("Домашнее задание 2");

        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) {
                System.out.print(a[i] + ",");
            } else {

                System.out.print(a[i]);
            }
            System.out.print(" ");
        }
        System.out.println(" ");


        for (double i = 0; i < b.length; i++) {
            if (i != b.length - 1) {
                System.out.print(b[(int) i] + ",");
            } else {
                System.out.println(b[(int) i]);
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (i != c.length - 1) {
                c[i] = (int) (Math.random() * 5);
                System.out.print(c[i] + ",");
            } else {
                System.out.println(c[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание 3");

        for (int i = a.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(a[i] + ",");
            } else {
                System.out.print(a[i]);
            }
        }

        System.out.println(" ");

        for (double i = b.length - 1; i >= 0; i--) {

            if (i != 0) {
                System.out.print(b[(int) i] + ",");
            } else {
                System.out.println(b[(int) i]);
            }
        }

        for (int i = c.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(c[i] + ",");
            } else {
                System.out.println(c[i]);
            }
        }

        System.out.println(" ");
        System.out.println("Домашнее задание 4");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] += 1;
            }
        }

        System.out.print(Arrays.toString(a));
    }

}







