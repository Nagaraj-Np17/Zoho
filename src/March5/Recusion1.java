package March5;

public class Recusion1 {

	public static String allStar(String str) {
		  if(str.length()<=1)return str;
		  if(str.charAt(0)==str.charAt(1)) {
			  return str.charAt(0)+"*"+allStar(str.substring(1));

		  }
		  return str.charAt(0)+allStar(str.substring(1));
		}

	public static void main(String[] args) {
		System.out.println(allStar("aaaa"));
	 	
	}

	
}
