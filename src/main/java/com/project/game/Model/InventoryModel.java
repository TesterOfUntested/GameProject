package com.project.game.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Document(collection = "InventoryModel")
public class InventoryModel {

    @Id
    String id;
    String characterId;
    List<ItemModel> itemModels;


    public String getId() {
        return id;
    }

    public List<ItemModel> getItemModels() {
        return itemModels;
    }

    public void setItemModels(List<ItemModel> itemModels) {
        this.itemModels = itemModels;
    }

    public void addItemModel(ItemModel itemModel) {
        itemModels.add(itemModel);
    }

    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public InventoryModel() {
        id = UUID.randomUUID().toString();
        this.characterId = null;
        itemModels = new ArrayList<ItemModel>();
    }

    public InventoryModel(String characterId) {
        id = UUID.randomUUID().toString();
        this.characterId = characterId;
        itemModels = new ArrayList<ItemModel>();
    }
}
