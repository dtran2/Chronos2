package ycpCS360;
import junit.framework.TestCase;
import ycpCS320.FakeDatabase;
import ycpCS320.Account;

/**
 * Tests methods in Fakedatabase.java
 * @author dtran2
 *
 */
public class testFakeDatabase extends TestCase {
	private FakeDatabase fd;
	public void setUp(){
		fd = new FakeDatabase();
		
		fd.createEvent("Test", 02, 17, 2013, 1223, 1000, "testEvent");
		fd.createAccount("Krusty", "Crab", "Krusty@xyz.com");
		fd.createAccount("Batman", "Robin", "Batman@xyz.com");
			
	}
	
	private void  testVerifyAccount(){
		//assertEquals("Crab", fd.verifyAccount("Krusty", "Crab"));	
	}
	private void testIsDupAccount(){
		
	}

	
	


}
