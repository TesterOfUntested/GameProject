package com.project.game.Controller;

import com.project.game.Model.ItemModel;
import com.project.game.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/createItem")
    public void createItem(@RequestParam(name="name", required = true) String name, @RequestParam(name="description", required = true) String description) {
        ItemModel itemModel = new ItemModel(name, description);
        itemRepository.save(itemModel);
    }

    @PostMapping("/deleteItem")
    public void deleteItem(@RequestParam(name = "itemId") String itemId) {
        itemRepository.deleteById(itemId);
    }

    @GetMapping("/getAllItems")
    public List<ItemModel> getAllItems() {
        List<ItemModel> allItems = itemRepository.findAll();
        return allItems;
    }

}
