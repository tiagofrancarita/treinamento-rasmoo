package br.com.franca.ws_rasmoo_plus.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subscription_type")
@Data
public class SubscriptionType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "subscription_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "acess_montths")
    private Long acess_montths;

    @Column(name = "description",precision = 10 , scale = 2)
    private BigDecimal price;

    @Column(name = "product_key")
    private String product_key;

    public SubscriptionType(Long id, String name, Long acess_montths, BigDecimal price, String product_key) {
        this.id = id;
        this.name = name;
        this.acess_montths = acess_montths;
        this.price = price;
        this.product_key = product_key;
    }

    public SubscriptionType() {
    }




}
