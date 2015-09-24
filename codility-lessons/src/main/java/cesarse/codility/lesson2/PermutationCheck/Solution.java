package cesarse.codility.lesson2.PermutationCheck;

/**
 * Check whether array A is a permutation.
 * 
 * @see <a href="https://codility.com/programmers/task/perm_check">Permutation
 *      Check task</a>.
 */
public class Solution {

	public int solution(int[] A) {
		int N = A.length;
		boolean[] isPresent = new boolean[N];
		for (int i : A) {
			if (i > N)
				return 0;
			if (isPresent[i - 1])
				return 0;
			isPresent[i - 1] = true;
		}
		return 1;
	}
}
