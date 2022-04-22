package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapUtilitiesTest {
	
	@Test
	@DisplayName("CommonKeyValuePairs Test Case")
	public void testCommonKeyValuePairs() throws NullMapException {
	
	    HashMap<String, String> map1 = new HashMap<>();
	    map1.put("Alice","Healthy");
	    map1.put("Mary","Ecastic");
	    map1.put("Bob","Happy");
	    map1.put("Chuck","Fine");
	    map1.put("Felix","Sick");
	    
	    HashMap<String, String> map2 = new HashMap<>();
	    map2.put("Alice","Healthy");
	    map2.put("Mary","Ecastic");
	    map2.put("Bob","Happy");
	    map2.put("Chuck","Fine");
	    map2.put("Felix","Sick");
	    
		HashMap<String, String> map3 = new HashMap<>();

	    map3.put("Felix","Healthy");
	    map3.put("Mary","Ecastic");
	    map3.put("Bob","Happy");
	    map3.put("Chuck","Fine");
	    map3.put("Felix","Sick");
	    
	    HashMap<String, String> map4 = new HashMap<>();

	    map4.put("Mary","Ecastic");
	    map4.put("Bob","Happy");
	    map4.put("Tam","Fine");
	    map4.put("Felix","Healthy");
	    map4.put("Ricardo","Subperb");
	    
		assertEquals(5, MapUtilities.commonKeyValuePairs(map1, map2));
		assertEquals(2, MapUtilities.commonKeyValuePairs(map3, map4));
	}
	
	@Test
	@DisplayName("Empty Map Test Case")
	public void emptyMap() throws NullMapException {
		HashMap<String, String> emptyMap1 = new HashMap<>();
		
	    
		assertEquals(MapUtilities.commonKeyValuePairs(emptyMap1, emptyMap1), 0);
	}
	
	@Test
	@DisplayName("NullMapException Thrown Test Case")
	public void testNullMapExceptionThrown() throws NullMapException {
		HashMap<String, String> map1 = null;
		HashMap<String, String> map2 = new HashMap<>();
		
	    
		Throwable exception = assertThrows;
	}

}
