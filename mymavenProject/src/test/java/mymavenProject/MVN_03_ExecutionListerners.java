package mymavenProject;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mymavenProject.MyListerners.class)
public class MVN_03_ExecutionListerners {

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		Assert.assertTrue(false);
	}

	@Test
	public void test3() {
		throw new SkipException("Skiiping the testcases.");
	}

	@Test
	public void test4() {
		Assert.assertTrue(true);
	}

	@Test
	public void test5() {
		Assert.assertTrue(false);
	}

	@Test
	public void test6() {
		throw new SkipException("Skiiping the testcases.");
	}

}
