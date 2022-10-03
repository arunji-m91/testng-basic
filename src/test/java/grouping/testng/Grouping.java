package grouping.testng;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="smoke")
	private void test1() {
		System.out.println("test1 method smoke group");
	}
	@Test(groups="sanity")
	private void test2() {
		System.out.println("test2 method sanity group");
	}
	@Test(groups="smoke")
	private void test3() {
		System.out.println("test3 method smoke group");
	}
	@Test(groups="sanity")
	private void test4() {
		System.out.println("test4 method sanity group");
	}
}
