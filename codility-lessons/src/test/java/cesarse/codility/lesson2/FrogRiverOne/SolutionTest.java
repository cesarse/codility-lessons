package cesarse.codility.lesson2.FrogRiverOne;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		int expected = 6;
		Solution s = new Solution();
		assertEquals(expected, s.solution(5, A));
		assertEquals(expected, s.anotherSolution(5, A));
	}

	@Test
	public void test2() {
		int[] A = { 2, 3, 4 };
		int expected = -1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(4, A));
		assertEquals(expected, s.anotherSolution(4, A));
	}

	@Test
	public void test3() {
		int[] A = { 1 };
		int expected = 0;
		Solution s = new Solution();
		assertEquals(expected, s.solution(1, A));
		assertEquals(expected, s.anotherSolution(1, A));
	}
}
