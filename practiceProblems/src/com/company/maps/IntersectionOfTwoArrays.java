package com.company.maps;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for(int num: nums1) {
            nums1Set.add(num);
        }
        for(int num: nums2) {
            nums2Set.add(num);
        }

        for(int num : nums1Set) {
            if(nums2Set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] result = new int[intersectionSet.size()];
        int i = 0;

        for(int num : intersectionSet) {
            result[i] = num;
            i++;
        }

        return result;
    }
}
