package cesarse.codility.lesson1.FrogJmp;

/**
 * Count minimal number of jumps from position X to Y.
 * 
 * @see <a href="https://codility.com/programmers/task/frog_jmp">Frog Jump
 *      task</a>.
 */
public class Solution {

	public int solution(int X, int Y, int D) {
		int distance = Y - X;
		if (distance % D == 0) {
			return distance / D;
		}
		return distance / D + 1;
	}

	/**
	 * Same as {@link #solution(int, int, int) solution}, but using just one
	 * (unintelligible) line.
	 */
	public int anotherSolution(int X, int Y, int D) {
		return (Y - X + D - 1) / D;
	}
}
