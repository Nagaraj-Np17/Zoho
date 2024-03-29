package Array1;

import java.util.Arrays;

/*Given an array of ints length 3, return a new array with the elements 
 * in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 * */
public class reverse3 {
	public static int[] reverse3(int[] nums) {
		  nums[0]=nums[0]+nums[nums.length-1];
		  nums[nums.length-1]=nums[0]-nums[nums.length-1];
		  nums[0]-=nums[nums.length-1];
		  return nums;
		}

	public static void main(String[] args) {
		int  arr1[]= {1, 2, 3};
		int res[]=reverse3(arr1);
		System.out.println(Arrays.toString(res));
	}

}
