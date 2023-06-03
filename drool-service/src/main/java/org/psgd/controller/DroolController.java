package org.psgd.controller;


import lombok.AllArgsConstructor;
import org.psgd.model.Order;
import org.psgd.services.DroolService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DroolController {
    private final DroolService service;

    @PostMapping("/execute-rule")
    public Integer executeRule(@RequestBody Order fact) {
        service.executeRules(fact);
        return fact.getDiscount();
    }
}
