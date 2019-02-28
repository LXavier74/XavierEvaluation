package fr.xavier.convertisseur;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanToNumeralTest {
protected RomanToNumeral op;

	@Before
	public void setUp() throws Exception {
		op = new RomanToNumeral();
	}

	@After
	public void tearDown() throws Exception {
	}

	int test = 1063;
	@Test
	public void testCalculer() throws Exception {
	 assertEquals(test, op.getNumeral("MLXIII"));
		 }
	@Test
	public void testCalculerII() throws Exception {
	 assertEquals(34, op.getNumeral("XXXIV"));
		 }

/*
 * 
 */
}
