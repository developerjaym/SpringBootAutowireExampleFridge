package com.example.fridge;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Fridge {
    @Id
    private int id;
    private int bagsOfFoodItemObjects;
}
