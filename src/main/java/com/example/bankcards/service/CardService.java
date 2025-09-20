package com.example.bankcards.service;

import com.example.bankcards.entity.CardEntity;
import com.example.bankcards.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public List<CardEntity> showAllCards() {
        return cardRepository.findAllByOrderByCardIdDesc();
    }
}
