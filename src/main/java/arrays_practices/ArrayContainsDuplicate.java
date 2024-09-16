package arrays_practices;

import java.util.ArrayList;

public class ArrayContainsDuplicate {

    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,1};
        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(nums));


    }

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            ArrayList<Integer> auxiliarList  = new ArrayList<>();
            for(int i=0; i <nums.length; i++) {
                if(!auxiliarList.contains(nums[i])){
                    auxiliarList.add(nums[i]);
                    for(int j=i+1; j<nums.length; j++)
                        if(nums[i]== nums[j]){
                            return true;
                        }
                }
            }
            return false;
        }
    }
}
