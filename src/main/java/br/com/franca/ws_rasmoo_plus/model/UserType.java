package br.com.franca.ws_rasmoo_plus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "user_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "user_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


}