package TestNgFramework;

import org.testng.annotations.Test;

public class TestngGrouping {

	/*Aim : use grouping method to run test case in xml sheet using include exclude concept */


	@Test(groups={"red"})
	public void RedBall() {

		System.out.println("red included");
	}
	@Test(groups={"red"})
	public void redBall() {
		System.out.println("white included");
	}
	@Test(groups={"black"})
	public void BlackBall() {
		System.out.println("black included");
	}
	@Test(groups={"black"})
	public void backBall() {
		System.out.println("purple included");
	}
	@Test(groups={"green"})
	public void GreenBall() {
		System.out.println("green exculded");
	}
	@Test(groups={"green"})
	public void greenball() {
		System.out.println("yellow exculded");

	}


















}
