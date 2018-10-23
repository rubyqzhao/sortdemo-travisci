package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	/*
	 *Test case for the path:
	  <22, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 28, 29, 33, 28, 27, 35>
	  Goes into both for loops, goes through if statement once when true and
	  once when false, then exits both loops.
	  One necessary path for edge coverage, also covers all nodes for node coverage
	  Also covers two condition coverage paths (if statement at line 29)
	 */
	@Test
	public void fullCycleTest() {
		Item[] expected = {new Item(21), new Item(22), new Item(23)};
		Item[] array = {new Item(22), new Item(21), new Item(23)};
		
		SortAlgos.bubbleSort(array);
		
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i].key + " is sorted into correct location",
					array[i].key == expected[i].key);
		}
	}
	
	/*
	 *Test case for the path <22, 35>
	  Throws the exception in the if statement at line 22
	  Other necessary path for edge coverage and condition coverage
	 */
	@Test (expected=java.lang.NullPointerException.class)
	public void testException() {
		Item[] array = null;
		SortAlgos.bubbleSort(array);
	}
	
	//Test selection sort
	@Test
	public void testSelectionSort() {
		Item[] array = {new Item(15), new Item(19), new Item(12), new Item(20)};
		Item[] expected = {new Item(12), new Item(15), new Item(19), new Item(20)};
		
		SortAlgos.selectionSort(array);
		
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i].key + " is sorted into correct location",
					array[i].key == expected[i].key);
		}
	}
	
	//Test insertion sort
	@Test
	public void testInsertionSort() {
		Item[] array = {new Item(15), new Item(19), new Item(12), new Item(20),
				new Item (10)};
		Item[] expected = {new Item(10), new Item(12), new Item(15), new Item(19),
				new Item(20)};
		
		SortAlgos.insertionSort(array);;
		
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i].key + " is sorted into correct location",
					array[i].key == expected[i].key);
		}
	}
	
	//Test merge sort
	@Test
	public void testMergeSort() {
		Item[] array = {new Item(15), new Item(19), new Item(12), new Item(20),
				new Item (10)};
		Item[] expected = {new Item(10), new Item(12), new Item(15), new Item(19),
				new Item(20)};
		
		SortAlgos.mergeSort(array);
		
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i].key + " is sorted into correct location",
					array[i].key == expected[i].key);
		}
	}
	
	//Test heap sort
	@Test
	public void testHeapSort() {
		Item[] array = {new Item(15), new Item(19), new Item(12), new Item(20),
				new Item (10)};
		Item[] expected = {new Item(10), new Item(12), new Item(15), new Item(19),
				new Item(20)};
		
		SortAlgos.heapSort(array);
		
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i].key + " is sorted into correct location",
					array[i].key == expected[i].key);
		}
	}
	
	//Test quick sort
	@Test
	public void testQuickSort() {
		Item[] array = {new Item(15), new Item(19), new Item(12), new Item(20),
				new Item (10)};
		Item[] expected = {new Item(10), new Item(12), new Item(15), new Item(19),
				new Item(20)};
		
		SortAlgos.quickSort(array);
		
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i].key + " is sorted into correct location",
					array[i].key == expected[i].key);
		}
	}

}
