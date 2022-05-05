package com.bridgelabz;
/**
 * Purpose - Given 3 Float find the maximum
 * @author -Ashish MAshal
 */
public class GenericProblems {

    /*
     * @param a1 : First value to compare
     * @param a2 : Second value to compare
     * @param a3 : Third value to compare
     * @return max : Maximum of three values
     */
    public static void maxOfValues(String str1, String str2, String str3){
        String max = str1;
        if (str2.compareTo(max)>0)
            max = str2;
        if (str3.compareTo(max)>0)
            max = str3;
        System.out.println("Maximum of "+str1+", "+str2+", "+str3+" is "+max);
    }
    public float maxOfValues(float a1, float a2, float a3) {
        float max = a1;
        if (a2 > max)
            max = a2;
        if (a3 > max)
            max = a3;
        return max;
    }
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
        System.out.println("The maximum value between the three Number is : " + generics.maxOfValues(8.0f, 15.1f, 5.8f));
        generics.maxOfValues("Apple", "Peach", "Banana");

    }
}
