
public class HighestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {7,10,2,38,4,42,12,9,1 };
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int element : myArray) {
			
			
			if(element > highest) {
				secondHighest = highest;
				highest = element;
			}else if(element > secondHighest) {
				secondHighest = element;
			}
		}
		
		System.out.println(highest);
		System.out.println(secondHighest);

	}

}
