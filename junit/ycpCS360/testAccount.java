package ycpCS360;
import java.util.HashMap;

import junit.framework.TestCase;
import ycpCS320.Account;
import ycpCS320.FakeDatabase;

/**
 * Test methods in Account class
 * Verify UserName, Password, and Email address are stored
 * @author cdavis17
 *
 */

public class testAccount extends TestCase {
	HashMap<String, Account> accountMap = new HashMap<String, Account>();
	private FakeDatabase fd;
	public void setUp(){
		fd = new FakeDatabase();
		fd.createAccount("Batman", "Robin", "Batman@xyz.com");
	}
	
	private void testGetUserName(){
		assertEquals(true, accountMap.containsKey("Batman"));
	}
	private void testGetPassword(){
		
	}
	private void testGetEmail(){
		
	}
}
