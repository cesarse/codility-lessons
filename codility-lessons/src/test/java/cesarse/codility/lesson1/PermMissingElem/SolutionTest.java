package cesarse.codility.lesson1.PermMissingElem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		int A[] = {2, 3, 1, 5};
		int expected = 4;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
	}
	
	@Test
	public void test2() {
		int n = 100000;
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = i+1;
		}
		Solution s = new Solution();
		int expected = 100001;
		assertEquals(expected, s.solution(A));
	}
	

}
