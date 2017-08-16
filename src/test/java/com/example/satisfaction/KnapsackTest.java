package com.example.satisfaction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KnapsackTest {
	
	@Autowired
	private Knapsack knapsack;
	
	@Test
	public void testSortedTimeData() {
		Item[] items = {
				new Item(30, 40),
				new Item(10, 60),
				new Item(20, 50)
		};
		
		assertEquals(110, knapsack.findMaxSatisfaction(40, items.length, items));
		assertEquals(150, knapsack.findMaxSatisfaction(60, items.length, items));
	}
	
	@Test
	public void testUnSortedTimeData() {
		Item[] items = {
				new Item(10, 60),
				new Item(20, 50),
				new Item(30, 40),
		};
		
		assertEquals(110, knapsack.findMaxSatisfaction(40, items.length, items));
		assertEquals(150, knapsack.findMaxSatisfaction(60, items.length, items));
	}

}
