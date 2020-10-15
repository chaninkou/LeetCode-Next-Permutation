package leetcode31;

public class FindNextPermutation {
	// O(n) and O(1)
	public void nextPermutation(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return;
		}

		int i = nums.length - 2;

		// Find the first index that is descending
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		// If nums is not ex:[3,2,1]
		if (i >= 0) {
			int j = nums.length - 1;

			// Then swap the biggest
			while (nums[j] <= nums[i]) {
				j--;
			}

			swap(nums, i, j);
		}

		// Reverse if needed
		reverse(nums, i + 1, nums.length - 1);
	}

	// Swap helper method
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];

		nums[i] = nums[j];

		nums[j] = temp;
	}

	// Reverse with 2 indexes
	private void reverse(int[] nums, int i, int j) {
		while (i < j) {
			swap(nums, i, j);

			i++;
			j--;
		}
	}
}
