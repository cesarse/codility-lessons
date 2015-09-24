package cesarse.codility.lesson1.FrogJmp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		int X = 10;
		int Y = 85;
		int D = 30;
		Solution s = new Solution();
		int expected = 3;
		assertEquals(expected, s.solution(X, Y, D));
		assertEquals(expected, s.anotherSolution(X, Y, D));
	}
	
	@Test
	public void test2() {
		int X = 1;
		int Y = 1000000000;
		int D = 1;
		Solution s = new Solution();
		int expected = 999999999;
		assertEquals(expected, s.solution(X, Y, D));
		assertEquals(expected, s.anotherSolution(X, Y, D));
	}

	@Test
	public void test3() {
		int X = 1;
		int Y = 1;
		int D = 1;
		Solution s = new Solution();
		int expected = 0;
		assertEquals(expected, s.solution(X, Y, D));
		assertEquals(expected, s.anotherSolution(X, Y, D));
	}

	@Test
	public void test4() {
		int X = 10;
		int Y = 10;
		int D = 5;
		Solution s = new Solution();
		int expected = 0;
		assertEquals(expected, s.solution(X, Y, D));
		assertEquals(expected, s.anotherSolution(X, Y, D));
	}
	
	@Test
	public void test5() {
		int X = 1;
		int Y = 30;
		int D = 4;
		Solution s = new Solution();
		int expected = 8;
		assertEquals(expected, s.solution(X, Y, D));
		assertEquals(expected, s.anotherSolution(X, Y, D));
	}
}
