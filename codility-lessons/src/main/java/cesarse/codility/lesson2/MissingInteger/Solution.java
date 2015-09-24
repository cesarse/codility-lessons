package cesarse.codility.lesson2.MissingInteger;

import java.util.BitSet;

/**
 * Find the minimal positive integer not occurring in a given sequence.
 * 
 * @see <a href="https://codility.com/programmers/task/missing_integer">Missing
 *      Integer task</a>.
 */
public class Solution {

	public int solution(int[] A) {
		boolean[] found = new boolean[A.length + 1];
		found[0] = true;

		for (int a : A) {
			if (a >= 1 && a <= A.length) {
				found[a] = true;
			}
		}
		int minimum = 0;
		for (int i = 0; i < found.length; i++) {
			if (found[i]) {
				minimum++;
			} else {
				break;
			}
		}

		return minimum;
	}

	/**
	 * Same as {@link #solution(int[]) solution}, but prettier and slower.
	 */
	public int anotherSolution(int[] A) {
		BitSet bs = new BitSet(A.length + 1);
		for (int a : A) {
			if (a >= 1 && a <= A.length) {
				bs.set(a);
			}
		}
		return bs.nextClearBit(1);
	}
}