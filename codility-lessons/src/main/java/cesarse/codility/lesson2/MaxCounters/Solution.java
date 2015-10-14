package cesarse.codility.lesson2.MaxCounters;

/**
 * Calculate the values of counters after applying all alternating operations:
 * increase counter by 1; set value of all counters to current maximum.
 * 
 * @see <a href="https://codility.com/programmers/task/max_counters">Max
 *      Counters task</a>.
 */
public class Solution {

	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		int lastMax = 0;
		for (int a : A) {
			if (a == N + 1) {
				lastMax = max;
			} else {
				if (counters[a - 1] <= lastMax) {
					counters[a - 1] = lastMax + 1;
				} else {
					counters[a - 1]++;
				}
				max = Math.max(max, counters[a - 1]);
			}
		}
		for (int i = 0; i < N; i++) {
			if (counters[i] < lastMax) {
				counters[i] = lastMax;
			}
		}
		return counters;
	}
}
