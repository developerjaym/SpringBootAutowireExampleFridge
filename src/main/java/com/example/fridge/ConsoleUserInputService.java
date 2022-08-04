package com.example.fridge;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class ConsoleUserInputService {
    @Autowired
    private Scanner scanner;

    public String getUserInput(String prompt) {
        System.out.println(prompt);
        String response = scanner.nextLine();
        return response;
    }

}
