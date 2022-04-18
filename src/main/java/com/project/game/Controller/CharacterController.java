package com.project.game.Controller;

import com.project.game.Model.CharacterModel;
import com.project.game.Model.InventoryModel;
import com.project.game.Repository.CharacterRepository;
import com.project.game.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private InventoryRepository inventoryRepository;

    @PostMapping("/createCharacter")
    public void createCharacter(@RequestParam(name="name", required=true) String name, @RequestParam(name="type", required=true) CharacterModel.Type type) {
        CharacterModel characterModel = new CharacterModel(name, type);
        InventoryModel inventoryModel = new InventoryModel(characterModel.getId());
        characterModel.setInventoryModel(inventoryModel);
        characterRepository.save(characterModel);
        inventoryRepository.save(inventoryModel);
    }

    @GetMapping("/getAllCharacters")
    public List<CharacterModel> getAllCharacters() {
        List<CharacterModel> allCharacters = characterRepository.findAll();
        return allCharacters;
    }

    @PostMapping("/deleteCharacter")
    public void deleteCharacter(@RequestParam(name = "characterId") String characterId) {
         characterRepository.deleteById(characterId);
    }

}
