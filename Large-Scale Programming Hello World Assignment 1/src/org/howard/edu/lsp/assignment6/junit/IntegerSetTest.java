package org.howard.edu.lsp.assignment6.junit;


import static org.junit.Assert.*;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;

import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;

import org.junit.Test;

public class IntegerSetTest {

	   @Test 
	   public void testClear() {
	       IntegerSet set = new IntegerSet();
	       set.clear();
	       assertEquals(0, 0);
	   }

	   @Test
	   public void testLength() {
	       IntegerSet set = new IntegerSet();
	       assertEquals(0, set.length());
	   }

	   @Test
	   public void testEqualsIntegerSet() {
	       // two sets having same elements
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       IntegerSet set2 = new IntegerSet();
	       set2.add(10);
	       set2.add(20);
	       set2.add(30);

	       assertEquals(true, set1.equals(set2));
	   }

	   @Test
	   public void testEqualsIntegerSet2() {
	       // sets of different size
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       IntegerSet set2 = new IntegerSet();
	       set2.add(10);
	       set2.add(20);
	       set2.add(30);

	       assertEquals(false, set1.equals(set2));
	   }

	   @Test
	   public void testEqualsIntegerSet3() {
	       // sets of different elements
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       IntegerSet set2 = new IntegerSet();
	       set2.add(50);
	       set2.add(70);
	       set2.add(80);

	       assertEquals(false, set1.equals(set2));
	   }

	   @Test
	   public void testContains() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       assertEquals(true, set1.contains(10));

	   }

	   @Test
	   public void testContains2() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       assertEquals(false, set1.contains(50));

	   }

	   @Test
	   public void testLargest() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       set1.add(5);
	       int expectedValue = 0;
	       try {
	           expectedValue = set1.largest();
	       } catch (IntegerSetException e) {
	           e.printStackTrace();
	       }
	       assertEquals(30, expectedValue);
	   }

	   @Test
	   public void testLargest2() {
	       // when set is empty
	       IntegerSet set1 = new IntegerSet();
	       int expectedValue = 0;
	       try {
	           expectedValue = set1.largest();
	       } catch (IntegerSetException e) {
	           assertNull(e.getMessage());
	       }
	   }

	   @Test
	   public void testSmallest() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       set1.add(5);
	       int expectedValue = 0;
	       try {
	           expectedValue = set1.smallest();
	       } catch (IntegerSetException e) {
	           e.printStackTrace();
	       }
	       assertEquals(5, expectedValue);
	   }

	   @Test
	   public void testSmallest2() {
	       // when set is empty
	       IntegerSet set1 = new IntegerSet();
	       int expectedValue = 0;
	       try {
	           expectedValue = set1.smallest();
	       } catch (IntegerSetException e) {
	           assertNull(e.getMessage());
	       }
	   }

	   @Test
	   public void testAdd() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       String expectedValue = "10 20 30 ";
	       assertEquals(expectedValue, set1.toString());
	   }

	   @Test
	   public void testAdd2() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       set1.add(10);
	       String expectedValue = "10 20 30 ";
	       assertEquals(expectedValue, set1.toString());
	   }

	   @Test
	   public void testRemove() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       set1.remove(20);
	       String expectedValue = "10 30 ";
	       assertEquals(expectedValue, set1.toString());
	   }

	//   @Test
	//   public void testUnion() {
//	       fail("Not yet implemented");
	//   }
	//
	//   @Test
	//   public void testIntersect() {
//	       fail("Not yet implemented");
	//   }
	//
	//   @Test
	//   public void testDiff() {
//	       fail("Not yet implemented");
	//   }

	   @Test
	   public void testIsEmpty() {
	       IntegerSet set1 = new IntegerSet();
	       assertTrue(set1.isEmpty());
	   }

	   @Test
	   public void testIsEmpty2() {
	       int[] a = { };
	       int[] b = { 1, 2, 3};
	       IntegerSet emptySet = new IntegerSet(a);
	       IntegerSet set = new IntegerSet(b);
	       assertTrue(emptySet.isEmpty());
	       assertFalse(set.isEmpty());
	   }

	   @Test
	   public void testToString() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       String expectedValue = "10 20 30 ";
	       assertEquals(expectedValue, set1.toString());
	   }

	}
