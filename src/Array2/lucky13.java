package Array2;

public class lucky13 {
	public static void main(String[] args) {

	}
	public boolean lucky13(int[] nums) {
		   for(int  i=0;i<nums.length;i++){
		     if(nums[i]==3 ||nums[i]==1){
		       return false;
		     }
		   }
		   return true;
		   
		   
		   
		}

}
