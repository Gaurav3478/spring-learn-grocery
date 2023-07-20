package com.gauravthakur.springlearngrocery.repository;

import com.gauravthakur.springlearngrocery.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryItemRepository extends MongoRepository<GroceryItem, Integer> {

    GroceryItem findById(@Param("id") int id);
}