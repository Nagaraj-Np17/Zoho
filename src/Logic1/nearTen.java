package Logic1;
/*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
* */
public class nearTen {
	public static boolean nearTen(int n) {
		  if(n<10&& 10-n<=2){
		    return true;
		  }
		  else{
		    if((n%10<=2) ||(n%10>=8) ){
		      return true;
		    }return false;
		  }
		  
		}
	public static void main(String[] args) {
		System.out.println(nearTen(12));
		System.out.println(nearTen(17));
		System.out.println(nearTen(19));

	}

}
