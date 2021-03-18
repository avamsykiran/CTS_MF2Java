package com.cts.jud.service.itemservicetest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.cts.jud.model.Item;
import com.cts.jud.service.ItemService;

public class ItemServiceComputeTest {

	ItemService itemService;
	
	@BeforeEach
	void setUp() {
		itemService= new ItemService();
	}
	
	@AfterEach
	void cleanUp() {
		itemService= null;
	}
	
	@Test
	void computeTest() {
		Item testData = new Item(101,"A4 Sheet Bundle",500.0);
		Item expected = new Item(101,"A4 Sheet Bundle",500.0,550.0,1000.0);
		Item actual = itemService.compute(testData);
		assertEquals(expected, actual);
	}
}
