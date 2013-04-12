package edu.ycp.cs320.chronos.server;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFakeDatabase {
	private FakeDatabase db;
	
	@Before
	public void setUp() {
		db = new FakeDatabase();
	}
	
	@Test
	public void testSomething() {
		assertTrue(true);
	}
}
