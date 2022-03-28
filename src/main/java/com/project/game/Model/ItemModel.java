package com.project.game.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ItemModel")
public class ItemModel {

    @Id
    int id;
    String name;
    String description;
    int additionalHealthPoints;
    int additionalManaPoints;
    int additionalAtkPoints;
    int additionalDefPoints;
    int additionalAgtPoints;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAdditionalHealthPoints() {
        return additionalHealthPoints;
    }

    public void setAdditionalHealthPoints(int additionalHealthPoints) {
        this.additionalHealthPoints = additionalHealthPoints;
    }

    public int getAdditionalManaPoints() {
        return additionalManaPoints;
    }

    public void setAdditionalManaPoints(int additionalManaPoints) {
        this.additionalManaPoints = additionalManaPoints;
    }

    public int getAdditionalAtkPoints() {
        return additionalAtkPoints;
    }

    public void setAdditionalAtkPoints(int additionalAtkPoints) {
        this.additionalAtkPoints = additionalAtkPoints;
    }

    public int getAdditionalDefPoints() {
        return additionalDefPoints;
    }

    public void setAdditionalDefPoints(int additionalDefPoints) {
        this.additionalDefPoints = additionalDefPoints;
    }

    public int getAdditionalAgtPoints() {
        return additionalAgtPoints;
    }

    public void setAdditionalAgtPoints(int additionalAgtPoints) {
        this.additionalAgtPoints = additionalAgtPoints;
    }

    public ItemModel(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
