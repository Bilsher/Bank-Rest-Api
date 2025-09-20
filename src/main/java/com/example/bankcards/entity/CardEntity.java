package com.example.bankcards.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="Cards", schema="Cards")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int cardId;
    @Column(name="Number")
    private String cardNumber;
    @Column(name="Owner")
    private String cardOwner;
    @Column(name="Duration")
    private int cardDuration;
    @Enumerated(EnumType.STRING)
    @Column(name="Status")
    private CardStatus cardStatus;
    @Column(name="Balance")
    private BigDecimal cardBalance;
    @Column(name="UserId")
    private int cardOwnerId;

    public CardEntity(){}

    public CardEntity(String cardNumber, String cardOwner, int cardDuration, CardStatus cardStatus, BigDecimal cardBalance, int cardOwnerId) {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.cardDuration = cardDuration;
        this.cardStatus = cardStatus;
        this.cardBalance = cardBalance;
        this.cardOwnerId = cardOwnerId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public int getCardDuration() {
        return cardDuration;
    }

    public void setCardDuration(int cardDuration) {
        this.cardDuration = cardDuration;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public BigDecimal getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(BigDecimal cardBalance) {
        this.cardBalance = cardBalance;
    }

    public int getCardOwnerId() {
        return cardOwnerId;
    }

    public void setCardOwnerId(int cardOwnerId) {
        this.cardOwnerId = cardOwnerId;
    }

    public enum CardStatus {
        ACTIVE, BLOCKED, EXPIRED
    }
}
