package cesarse.codility.lesson1.TapeEquilibrium;

/**
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 * 
 * @see <a href="https://codility.com/programmers/task/tape_equilibrium">Tape
 *      Equilibrium task</a>.
 */
public class Solution {

	public int solution(int[] A) {
		int size = A.length - 1;

		int[] leftToRightSum = new int[size];
		int[] rightToLeftSum = new int[size];

		int sum = A[0];
		for (int i = 0; i < size; i++) {
			leftToRightSum[i] = sum;
			sum += A[i + 1];
		}

		sum = A[size];
		for (int i = size; i > 0; i--) {
			rightToLeftSum[i - 1] = sum;
			sum += A[i - 1];
		}

		int minimalDifference = Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			int difference = Math.abs(rightToLeftSum[i] - leftToRightSum[i]);
			minimalDifference = Math.min(minimalDifference, difference);
		}

		return minimalDifference;
	}

	/**
	 * Same as {@link #solution(int[]) solution}, but without extra memory
	 * usage.
	 */
	public int anotherSolution(int[] A) {
		for (int i = A.length - 2; i >= 0; i--) {
			A[i] += A[i + 1];
		}

		int minimalDifference = Integer.MAX_VALUE;
		for (int i = 1; i <= A.length - 1; i++) {
			minimalDifference = Math.min(minimalDifference, Math.abs(A[i] + A[i] - A[0]));
		}

		return minimalDifference;
	}
}
