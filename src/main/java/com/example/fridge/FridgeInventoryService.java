package com.example.fridge;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.Scanner;

@Service // It makes this FridgeInventoryService autowireable
public class FridgeInventoryService {

    @Autowired
    // Spring Boot knows how to create a FridgeRepository
    // so I do NOT need to do = new FridgeRepository
    private FridgeRepository repository;

    @Autowired
    private FridgeFactory fridgeFactory;


    public void createFridge() {
        Fridge fridge = new Fridge();
        fridge.setBagsOfFoodItemObjects(3);
        repository.save(fridge);
    }

    public int figureOutHowManyBagsINeed() {
        return 10 - repository.findById(1).get().getBagsOfFoodItemObjects();
    }


}
