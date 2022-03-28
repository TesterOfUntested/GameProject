package com.project.game.Repository;

import com.project.game.Model.CharacterModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<CharacterModel, String> {

    CharacterModel findById(int characterModelId);

}
