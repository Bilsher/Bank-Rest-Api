package com.example.bankcards.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.Collections;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Users", schema="Users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long userId;

    @Column(name="username")
    private String userName;
    @Column(name="password")
    private String userPassword;

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    private Role userRole;
    public UserEntity() {
    }
    public UserEntity(String userName, String userPassword, Role userRole) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    // Методы для Spring Security
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + userRole.name()));
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public enum Role {
        USER, ADMIN
    }
}