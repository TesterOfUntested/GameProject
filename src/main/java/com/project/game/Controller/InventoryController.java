package com.project.game.Controller;

import com.project.game.Model.InventoryModel;
import com.project.game.Model.ItemModel;
import com.project.game.Repository.InventoryRepository;
import com.project.game.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/addInventory")
    public void addInventory(@RequestParam(name="characterId") String characterId) {
        InventoryModel inventoryModel = new InventoryModel(characterId);
        inventoryRepository.save(inventoryModel);
    }

    @GetMapping("/getAllInventories")
    public List<InventoryModel> getAllInventories() {
        List<InventoryModel> inventoryModels = inventoryRepository.findAll();
        return inventoryModels;
    }

    @GetMapping("/getCharacterInventory")
    public InventoryModel getInventory(@RequestParam(name = "characterId") String characterId) {
        return inventoryRepository.findByCharacterId(characterId);
    }

    @RequestMapping(method = RequestMethod.PATCH, path = "/addItemToInventory")
    public void addItemToInventory(@RequestParam(name = "inventoryId") String inventoryId, @RequestParam(name = "itemId") String itemId) {
        if(itemRepository.findById(itemId).isPresent() && inventoryRepository.findById(inventoryId).isPresent()) {
            InventoryModel inventoryModel = inventoryRepository.findById(inventoryId).get();
            ItemModel itemModel = itemRepository.findById(itemId).get();

            inventoryModel.addItemModel(itemModel);
            inventoryRepository.save(inventoryModel);
        }
    }

    @PostMapping("/deleteInventory")
    public void deleteInventory(@RequestParam(name="inventoryId") String inventoryId) {
        inventoryRepository.deleteById(inventoryId);
    }


    @RequestMapping(method = RequestMethod.PATCH, path = "/deleteItemFromInventory")
    public void deleteItemFromInventory(@RequestParam(name = "inventoryId") String inventoryId, @RequestParam(name = "itemId") String itemId) {
        if(itemRepository.findById(itemId).isPresent() && inventoryRepository.findById(inventoryId).isPresent()) {
            InventoryModel inventoryModel = inventoryRepository.findById(inventoryId).get();
            ItemModel itemModel = itemRepository.findById(itemId).get();

            inventoryModel.deleteItemModel(itemModel);
            inventoryRepository.save(inventoryModel);
        }
    }
}
