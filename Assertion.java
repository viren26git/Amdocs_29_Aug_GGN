package amdocs.testcases;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import example.tests.Even_Odd_Example;

@RunWith(JUnitPlatform.class)
@DisplayName("This is the Assertion example")
public class AssertionsExample {
	
	@Test()
	@Tag("DEV")
	public void AssertionMethod()
	{
		
		Even_Odd_Example obj1 = new Even_Odd_Example();
		Even_Odd_Example obj2 = new Even_Odd_Example();
		
		boolean r = obj1.Check(34);
		
		assertTrue(r); // pass
		assertFalse(r);  // fail
		
		String s= "India";
		String s1 = new String("India");
		String m = "India";
		
		
		//obj.check(34);
		
		assertTrue(23 >9);   // pass
		assertFalse(56 <8);  // pass
		assertEquals(obj1, obj2);  // false
		assertNotEquals(null, obj1);  // pass
		
		obj2 = null;
		assertNotEquals(null, obj2);   //fail
		
		assertEquals(s1, s);  // false
		assertNotEquals(null, s);  // pass
		
		assertSame(s, s1);
		
		
	}
	

}
