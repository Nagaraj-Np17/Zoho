package Logic2;
/*We want to make a row of bricks that is goal inches long
 We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
 Return true if it is possible to make the goal by choosing from the given bricks. 
 This is a little harder than it looks and can be done without any loops.
 makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 * */
public class makeBricks {
	static boolean makeBricks(int small, int big, int goal) {
		  if(small+big*5<goal)return false;
		  if(big*5==goal)return true;
		  int need=goal-big*5;
		  if(need>0){
		    return (need<=small)?true:false;
		  }else{
		    need=goal%5;
		    return (need<=small)?true:false;
		  }
		  	
		}

	public static void main(String[] args) {
		System.out.println( makeBricks(3, 1, 8));
		System.out.println( makeBricks(3, 1, 9));
		System.out.println( makeBricks(3, 2,10));

	}

}
