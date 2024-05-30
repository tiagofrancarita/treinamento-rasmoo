package br.com.franca.ws_rasmoo_plus.model;

import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "user_payment_info")
@Data
public class UserPaymentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_payment_info_id")
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_expiration_month")
    private String cardExpirationMonth;

    @Column(name = "card_expiration_year")
    private String cardExpirationYear;

    @Column(name = "cad_security_code")
    private String cadSecurityCode;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "dt_payment")
    private LocalDate dtPayment;

    @OneToOne
    @JoinColumn(name = "users_id")
    private Users users;

    public UserPaymentInfo() {


    }

    public UserPaymentInfo(Long id, String cardNumber, String cardExpirationMonth, String cardExpirationYear, String cadSecurityCode, BigDecimal price, LocalDate dtPayment, Users users) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardExpirationMonth = cardExpirationMonth;
        this.cardExpirationYear = cardExpirationYear;
        this.cadSecurityCode = cadSecurityCode;
        this.price = price;
        this.dtPayment = dtPayment;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpirationMonth() {
        return cardExpirationMonth;
    }

    public void setCardExpirationMonth(String cardExpirationMonth) {
        this.cardExpirationMonth = cardExpirationMonth;
    }

    public String getCardExpirationYear() {
        return cardExpirationYear;
    }

    public void setCardExpirationYear(String cardExpirationYear) {
        this.cardExpirationYear = cardExpirationYear;
    }

    public String getCadSecurityCode() {
        return cadSecurityCode;
    }

    public void setCadSecurityCode(String cadSecurityCode) {
        this.cadSecurityCode = cadSecurityCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDtPayment() {
        return dtPayment;
    }

    public void setDtPayment(LocalDate dtPayment) {
        this.dtPayment = dtPayment;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
