package br.com.franca.ws_rasmoo_plus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "user_payment_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;


}