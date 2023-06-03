package org.pasargad.service;


import lombok.AllArgsConstructor;
import org.pasargad.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MegaOfferService {

    public Order setOrderDiscount(Order order) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Integer> discount = restTemplate.postForEntity("http://localhost:8001/execute-rule",order, Integer.class);
        order.setDiscount(discount.getBody());
        return order;
    }

}
