package br.com.franca.ws_rasmoo_plus.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "users_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "dt_subscription")
    private LocalDate dataSubscription = LocalDate.now();

    @Column(name = "dt_expiration")
    private LocalDate dataExpiration;

    @ManyToOne
    @JoinColumn(name = "user_type_id")
    private  UserType userType;

    @ManyToOne()
    @JoinColumn(name = "subscription_type_id")
    private SubscriptionType subscriptionType;

    @Column(name = "password")
    private String password;

    public Users() {
    }

    public Users(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}