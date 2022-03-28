package com.project.game.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "InventoryModel")
public class InventoryModel {

    @Id
    int id;
    List<ItemModel> itemModels;


    public int getId() {
        return id;
    }

    public List<ItemModel> getItemModels() {
        return itemModels;
    }

    public void setItemModels(List<ItemModel> itemModels) {
        this.itemModels = itemModels;
    }

    public InventoryModel() {
    }
}
