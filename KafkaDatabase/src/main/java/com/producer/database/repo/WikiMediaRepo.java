package com.producer.database.repo;

import com.producer.database.entity.WikimediaData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikiMediaRepo extends MongoRepository<WikimediaData,String> {

}
