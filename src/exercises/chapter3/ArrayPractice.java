package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[6];
        anArray[0] = 1;
        anArray[1] = 1;
        anArray[2] = 2;
        anArray[3] = 3;
        anArray[4] = 5;
        anArray[5] = 8;
        for (int i : anArray) {
            System.out.println(i);
        }
        String thisString;
        thisString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] thisArray = thisString.split("\\.", -1);
        System.out.println(Arrays.toString(thisArray));
    }



}
