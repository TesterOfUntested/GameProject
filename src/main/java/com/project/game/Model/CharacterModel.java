package com.project.game.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "CharacterModel")
public class CharacterModel {
    public enum Type {
        Warrior, Archer, Mage;
    }

    @Id
    String id;
    String name;
    Type type;
    int level;
    int experience;
    int healthPoints;
    int manaPoints;
    int atkPoints;
    int defPoints;
    int agtPoints;
    InventoryModel inventoryModel;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getAtkPoints() {
        return atkPoints;
    }

    public void setAtkPoints(int atkPoints) {
        this.atkPoints = atkPoints;
    }

    public int getDefPoints() {
        return defPoints;
    }

    public void setDefPoints(int defPoints) {
        this.defPoints = defPoints;
    }

    public int getAgtPoints() {
        return agtPoints;
    }

    public void setAgtPoints(int agtPoints) {
        this.agtPoints = agtPoints;
    }

    public InventoryModel getInventoryModel() {
        return inventoryModel;
    }

    public void setInventoryModel(InventoryModel inventoryModel) {
        this.inventoryModel = inventoryModel;
    }

    public CharacterModel(String name, CharacterModel.Type type) {
        String id = UUID.randomUUID().toString();
        this.id = id;
        this.name = name;
        this.type = type;
        this.inventoryModel =  new InventoryModel(id);
    }
}
