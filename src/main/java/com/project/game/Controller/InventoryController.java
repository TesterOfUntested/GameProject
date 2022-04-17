package com.project.game.Controller;

import com.project.game.Model.InventoryModel;
import com.project.game.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

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

    @RequestMapping(method = RequestMethod.PATCH)
    public void addItemToInventory(@RequestParam(name = "inventoryId") String inventoryId, @RequestParam(name = "itemId") String itemId) {

    }

}
