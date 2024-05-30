package br.com.franca.ws_rasmoo_plus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subscription_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

}