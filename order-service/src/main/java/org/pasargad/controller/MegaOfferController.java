package org.pasargad.controller;

import lombok.AllArgsConstructor;

import org.pasargad.model.Order;
import org.pasargad.service.MegaOfferService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/mega-cart")
@AllArgsConstructor
public class MegaOfferController {
    private final MegaOfferService service;

    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order) {
        return service.setOrderDiscount(order);
    }
}
