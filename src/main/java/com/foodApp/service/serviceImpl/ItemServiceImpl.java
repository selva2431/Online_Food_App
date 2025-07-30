package com.foodApp.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodApp.entities.Item;
import com.foodApp.payloads.ItemPayload;
import com.foodApp.repositry.ItemRepository;
import com.foodApp.service.ItemService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemRepository itemRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<ItemPayload> getAllItems() {
		List<Item> items = itemRepository.findAll();
		return items.stream().map(item -> modelMapper.map(item, ItemPayload.class)).collect(Collectors.toList());
	}

	public ItemPayload getItemById(int itemId) {
		Item item = itemRepository.findById(itemId).orElse(null);
		if (item != null) {
			return modelMapper.map(item, ItemPayload.class);
		}
		return null;
	}

	public ItemPayload createItem(ItemPayload itemPayload) {
		Item item = modelMapper.map(itemPayload, Item.class);
		Item savedItem = itemRepository.save(item);
		return modelMapper.map(savedItem, ItemPayload.class);
	}

	public void deleteItem(int itemId) {
		itemRepository.deleteById(itemId);
	}
}
