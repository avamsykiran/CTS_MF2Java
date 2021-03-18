package com.cts.jud.service;

import com.cts.jud.model.Item;

public class ItemService {

	public Item compute(Item item) {
		item.setSellingPrice(item.getBasePrice()+(item.getBasePrice()*0.10));
		item.setMaxRetailPrice(item.getBasePrice()*2);
		return item;
	}
}
