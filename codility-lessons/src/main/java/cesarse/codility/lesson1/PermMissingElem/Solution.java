package cesarse.codility.lesson1.PermMissingElem;

/**
 * Find the missing element in a given permutation.
 * 
 * @see <a href="https://codility.com/programmers/task/perm_missing_elem">
 *      Permutation Missing Element task</a>.
 */
public class Solution {

	public int solution(int[] A) {
		long n = A.length + 1;
		long sum = (n * (1 + n)) / 2;
		for (int i : A) {
			sum -= i;
		}
		return (int) sum;
	}

}
