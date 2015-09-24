package cesarse.codility.lesson2.MissingInteger;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		int[] A = { 1, 3, 6, 4, 1, 2 };
		int expected = 5;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test2() {
		int[] A = { 2 };
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test3() {
		int[] A = { 1 };
		int expected = 2;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test4() {
		int[] A = { -1 };
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test5() {
		int[] A = { 0 };
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test6() {
		int[] A = { Integer.MIN_VALUE, Integer.MAX_VALUE };
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test7() {
		int[] A = { -1, -2, -3 };
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test8() {
		int[] A = { -1, -2, -3, 0, 1, 2, 3 };
		int expected = 4;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test9() {
		int[] A = { 10, 10, 10 };
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test10() {
		int[] A = { 1, 2, 3 };
		int expected = 4;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

	@Test
	public void test11() {
		int[] A = { 1, 2, 3, 5, 6, 7 };
		int expected = 4;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
		assertEquals(expected, s.anotherSolution(A));
	}

}
