package com.example.fridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShopperService {
    @Autowired
    private FridgeInventoryService fridgeInventoryService;

    @Autowired
    @Qualifier("amazon")
    private RestTemplate amazonRestTemplate;

    public void shop() {
        amazonRestTemplate.postForObject("/buystuff", new OrderRequest(), OrderResponse.class);
    }
}

class OrderRequest {
    // imagine an object that you might send a retailer to place an order
}

class OrderResponse {
    // imagine an object that a retailer might send you after you place an order
}