package cesarse.codility.lesson2.MaxCounters;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		int[] expected = { 3, 2, 2, 4, 2 };
		Solution s = new Solution();		
		assertArrayEquals(expected, s.solution(5, A));
	}

	@Test
	public void test2() {
		int[] A = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		int[] expected = { 0, 0, 0, 0 };
		Solution s = new Solution();		
		assertArrayEquals(expected, s.solution(4, A));
	}
	
	@Test
	public void test3() {
		int[] A = { 1, 1, 2, 1, 1, 2, 1, 1, 1, 2 };
		int[] expected = { 7 };
		Solution s = new Solution();		
		assertArrayEquals(expected, s.solution(1, A));
	}
	
	@Test
	public void test4() {
		int[] A = { 1, 1, 1, 5, 2, 2, 1, 5, 2 };
		int[] expected = { 5, 6, 5, 5 };
		Solution s = new Solution();		
		assertArrayEquals(expected, s.solution(4, A));
	}
}
