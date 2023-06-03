package org.psgd.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String cartType;
    private Integer amount;
    private Integer discount;
    private Integer age;
}
