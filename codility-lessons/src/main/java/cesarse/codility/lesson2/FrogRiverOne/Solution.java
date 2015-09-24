package cesarse.codility.lesson2.FrogRiverOne;

import java.util.BitSet;

/**
 * Find the earliest time when a frog can jump to the other side of a river.
 * 
 * @see <a href="https://codility.com/programmers/task/frog_river_one">Frog
 *      River One task</a>.
 */
public class Solution {

	public int solution(int X, int[] A) {
		int pathSize = 0;
		boolean[] hasLeaf = new boolean[X + 1];
		for (int i = 0; i < A.length; i++) {
			if (hasLeaf[A[i]])
				continue;
			hasLeaf[A[i]] = true;
			pathSize++;
			if (pathSize == X)
				return i;
		}

		return -1;
	}

	/**
	 * Same as {@link #solution(int, int[]) solution}, but prettier and slower.
	 */
	public int anotherSolution(int X, int[] A) {
		BitSet hasLeaf = new BitSet(X + 1);
		for (int i = 0; i < A.length; i++) {
			hasLeaf.set(A[i]);
			if (hasLeaf.cardinality() == X)
				return i;
		}
		return -1;
	}
}
