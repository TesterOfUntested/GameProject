package com.project.game.Controller;

import com.project.game.Model.InventoryModel;
import com.project.game.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @PostMapping("/addInventory")
    public void addInventory(@RequestParam(name="characterId") String characterId) {
        InventoryModel inventoryModel = new InventoryModel(characterId);
        inventoryRepository.save(inventoryModel);
    }

    @GetMapping("/getCharacterInventory")
    public InventoryModel getInventory(@RequestParam(name = "characterId") int characterId) {
        return inventoryRepository.findByCharacterId(characterId);
    }

}
