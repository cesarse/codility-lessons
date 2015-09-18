package cesarse.codility.lesson2.PermutationCheck;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		int[] A = {4, 1, 3, 2};
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
	}
	
	@Test
	public void test2() {
		int[] A = {4, 1, 3};
		int expected = 0;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
	}
	
	@Test
	public void test3() {
		int[] A = {1};
		int expected = 1;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A)); 
	}
	
	@Test
	public void test4() {
		int[] A = {2};
		int expected = 0;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A)); 
	}
	
	@Test
	public void test5() {
		int[] A = {1, 2, 3, 4, 1000000000};
		int expected = 0;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A)); 
	}
	
	@Test
	public void test6() {
		int[] A = new int[100000]; 
		Arrays.fill(A, 1000000000);
		int expected = 0;
		Solution s = new Solution();
		assertEquals(expected, s.solution(A));
	}
}

