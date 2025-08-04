package com.mardixx.angularShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserModel {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;

    private Boolean isAdmin;

    private Long balance;
}
