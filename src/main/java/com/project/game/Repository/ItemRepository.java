package com.project.game.Repository;

import com.project.game.Model.ItemModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<ItemModel, String> {
}
