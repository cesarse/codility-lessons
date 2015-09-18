package cesarse.codility.lesson1.TapeEquilibrium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		int[] A = {3, 1, 2, 4, 3};
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.unintelligibleSolution(A));
	}

	@Test
	public void test2() {
		int[] A = {1, -1, 1, -1, 1, -1};
		int expected = 0;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.unintelligibleSolution(A));
	}
	
	@Test
	public void test3() {
		int[] A = {0, 0, 0, 0, 0, 0};
		int expected = 0;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.unintelligibleSolution(A));
	}

	@Test
	public void test4() {
		int[] A = {-2, 3};
		int expected = 5;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.unintelligibleSolution(A));
	}
	
}

