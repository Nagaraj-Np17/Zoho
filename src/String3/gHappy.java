package String3;
/*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 * */
public class gHappy {
	public static boolean gHappy(String str) {
		 if(str.length()==1)return false;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)=='g') {
				if((i>0)&&str.charAt(i-1)=='g') {
					continue;
				}else if(i+1<str.length()&&  str.charAt(i+1)=='g') {
					continue;
				}else {
					return false;
				}
			}		
		  
		}
		return true;
}
	public static void main(String[] args) {
	System.out.println(gHappy("xxggxx"));
	System.out.println(gHappy("xxgxx"));
	System.out.println(gHappy("xxggyygxx"));
	}	
	}
