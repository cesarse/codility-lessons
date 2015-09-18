package cesarse.codility.lesson2.PermutationCheck;

public class Solution {

	public int solution(int[] A) {
		int N = A.length;
		boolean[] isPresent = new boolean[N];
		for(int i : A) {
			if (i > N) return 0;
			if (isPresent[i-1]) return 0;
			isPresent[i-1] = true;
		}
		return 1;
	}
}
