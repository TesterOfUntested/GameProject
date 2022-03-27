package com.project.game.Model;

import java.util.List;

public class InventoryModel {

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
