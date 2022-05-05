package com.bridgelabz;
/**
 * Purpose - Refactor to create Generic Class to take in 3 variables of Generic Type
 * @author -Ashish Mashal
 */
public class GenericProblems <T extends Comparable<T>> {

    T a1, a2, a3, a4, a5, a6;

    public GenericProblems(T a1, T a2, T a3, T a4, T a5, T a6) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
        this.a6 = a6;
    }

    /**
     * Generic method to compare any type of data and find maximum
     *
     * @param a1 : First value to compare
     * @param a2 : Second value to compare
     * @param a3 : Third value to compare
     * @param a4 : First value to compare
     * @param a5 : Second value to compare
     * @param a6 : Third value to compare
     * @return max : Maximum of three values
     */
    public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3, T a4, T a5, T a6) {
        T max = a1;
        if (a2.compareTo(max) > 0) {
            max = a2;
        }
        if (a3.compareTo(max) > 0) {
            max = a3;
        }
        if (a4.compareTo(max) > 0) {
            max = a4;
        }
        if (a5.compareTo(max) > 0) {
            max = a5;
        }
        if (a6.compareTo(max) > 0) {
            max = a6;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Find Maximum Problem Using Generics.");
        System.out.println("The maximum value between the three Integers is : " + maxOfValues(20, 12, 15, 19, 18, 81));
        System.out.println("The maximum value between the three Floats is : " + maxOfValues(20.3f, 22.1f, 15.9f, 22.6f, 21.9f, 33.6f));
        System.out.println("The maximum value between the three Strings is : " + maxOfValues("Apple", "Ashish", "Banana", "Mashal", "Vicky", "Pune"));
    }
}
