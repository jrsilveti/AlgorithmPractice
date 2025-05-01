package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ExtraCandy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList = new ArrayList<>();
        OptionalInt max = Arrays.stream(candies).max();

        for(int i : candies) {
            if(i + extraCandies >= max.getAsInt()) {
                resultList.add(true);
            } else {
                resultList.add(false);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {
        int[] inputArray = {2,3,5,1,3};
        int extraCandy = 3;

        System.out.println("Result = " + kidsWithCandies(inputArray, extraCandy));
    }
}
