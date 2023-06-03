package org.pasargad.model;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String customerNumber;
    private String cartType;
    private Integer age;
    private Integer amount;
    private Integer discount;
}
