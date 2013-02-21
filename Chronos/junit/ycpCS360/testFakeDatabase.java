package ycpCS360;
import edu.ycp.cs320.chronos.database.FakeDatabase;

/**
 * Tests methods in Fakedatabase.java
 * @author dtran2
 *
 */
public class testFakeDatabase {
	private FakeDatabase fd;
	public void setUp(){
		fd = new FakeDatabase();
		
		fd.createEvent("Test", 02, 17, 2013, 1223, 1000, "testEvent");
		fd.createAccount("Krusty", "Crab");
			
	}
	
	private void  testVerifyAccount(){
		//assertTrue("Crab", fd.verifyAccount("Krusty", "Crab"));
	}
	


}
