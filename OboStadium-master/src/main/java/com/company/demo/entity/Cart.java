package com.company.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")
    private Long price;
    @Column(name = "image")
    private String image;
    @Column(name = "total")
    private Long total;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "user_id")
    private Long userId;

}
