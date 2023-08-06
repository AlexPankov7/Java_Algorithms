package com.example.javaalgorithms;

public class bubbleSort {

    public static void main (String[] args){

        int[] nums = {2, 1, 3, 5, 9, 4, 24, 0};
        int temp;                   // We will use for temporary storage
        boolean sorted = false;     // To understand whether this sorting cycle needs to be repeated

        while (!sorted) {   // Cycle While will work while sorted = false
            sorted = true;  // At the start of the loop, set it to = true


            for (int i = 0; i < nums.length - 1; i++) {     // Cycle for will directly participate in sorting array nums
                if (nums[i] > nums[i+1]){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
         }
        for(int i : nums){
        System.out.println(i);
    }
}
}