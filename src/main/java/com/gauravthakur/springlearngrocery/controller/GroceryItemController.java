package com.gauravthakur.springlearngrocery.controller;

import com.gauravthakur.springlearngrocery.model.GroceryItem;
import com.gauravthakur.springlearngrocery.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GroceryItemController {
    /*
    what functions can we add?
    1) addItem - add a new grocery to the GroceryItems list
    2) deleteItem - takes as input an ID and deletes the grocery with the specified ID
    3) modifyPrice - (PUT Request) modify the price of a grocery given its ID
    4) viewItems - view a list of all items currently in the database
     */
    @Autowired
    GroceryItemRepository gir;

    @GetMapping("/viewItems")
    public List<GroceryItem> viewItems() {
        return gir.findAll();
    }

    @PostMapping("/addItem")
    public String addItem(@RequestBody GroceryItem groceryItem) {
        gir.save(groceryItem);
        return "Item added";
    }

    @DeleteMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable int id) {
        GroceryItem item = gir.findById(id);
        gir.delete(item);
        return "Item deleted";
    }

    @PutMapping("/modifyPrice")
    public String modifyPrice(@RequestParam int id, @RequestParam double price) {
        GroceryItem item = gir.findById(id);
        item.setPrice(price);
        gir.save(item);
        return "Item modified";
    }
}
