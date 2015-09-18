package cesarse.codility.lesson1.PermMissingElem;

public class Solution {

	public int solution(int[] A) {
		long n = A.length+1;
		long sum = (n * (1 + n))/2;
		for (int i : A) {
			sum -= i;
		}		
		return (int)sum;
	}
	
}
