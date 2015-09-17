package cesarse.codility.lesson1.FrogJmp;

/**
 * @see <a href="https://codility.com/demo/take-sample-test/frog_jmp/">Frog Jump lesson</a>.
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
	 * Same as {@link #solution(int, int, int) solution}, but using just one line.
	 */
	public int unintelligibleSolution(int X, int Y, int D) {		
		return (Y - X + D - 1)/D;
	}
}
