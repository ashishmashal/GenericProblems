package com.bridgelabz;
/**
 * Purpose - Refactor all the 3 to One Generic Method and find the maximum
 * @author -Ashish Mashal
 */
public class GenericProblems {

    /*
     * @param a1 : First value to compare
     * @param a2 : Second value to compare
     * @param a3 : Third value to compare
     * @return max : Maximum of three values
     */
    public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;


    }

    public static void main(String[] args) {
        System.out.println("Welcome To Generic Problems");
        GenericProblems generics = new GenericProblems();
        System.out.println("The maximum value between the three Number is : " + generics.maxOfValues(8, 15, 5));
        System.out.println("The maximum value between the three Number is : " + generics.maxOfValues(8.0f, 15.1f, 5.8f));
        System.out.println("The maximum value between the three Strings is : "+ maxOfValues("Lion", "Yak", "zebra"));

    }
}
