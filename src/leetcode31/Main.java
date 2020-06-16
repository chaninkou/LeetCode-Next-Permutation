package leetcode31;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,3,2};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindNextPermutation solution = new FindNextPermutation();
		
		solution.nextPermutation(nums);
		
		System.out.println("Solution: " + Arrays.toString(nums));
		
	}
}
