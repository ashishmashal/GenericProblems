package com.bridgelabz;

public class GenericProblems {
    public int maxOfValues(int a1, int a2, int a3) {
        int max = a1;
        if (a2 > max)
            max = a2;
        if (a3 > max)
            max = a3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Generic Problems");
        GenericProblems generics = new GenericProblems();
        System.out.println("The maximum value between the three Number is : " + generics.maxOfValues(8, 15, 5));

    }
}
