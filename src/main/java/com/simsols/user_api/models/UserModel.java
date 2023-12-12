package com.simsols.user_api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@Entity
@Table(name="USER")
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    private String fullName;
    @Column(name = "ISSTAFF")
    private boolean isStaff;


}
