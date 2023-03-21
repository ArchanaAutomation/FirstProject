package TestNgFramework;
import org.testng.annotations.Test;

//it will display o/p in alpheatical order
//to get exact o/p need to use 
public class DemoClass {

	@Test (priority=0)
	public void morning(){
		System.out.println("testing method one");
	}
	@Test (priority=1)
	public void afternoon() {
		System.out.println("testing method two");
	}
	@Test(priority=2)
	public void evening() {
		System.out.println("testing method three");
	}
	@Test(priority=1)
	public void night() {
		System.out.println("testing method four");

	}

}
	