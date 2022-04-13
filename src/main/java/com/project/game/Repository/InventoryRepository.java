package com.project.game.Repository;

import com.project.game.Model.InventoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository<InventoryModel, String> {

    InventoryModel findByCharacterId(int characterId);

}
