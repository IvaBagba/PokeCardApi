package com.ivan.pokecard.Services;

import com.ivan.pokecard.Models.Card;
import com.ivan.pokecard.Repo.CardRepository;
import com.ivan.pokecard.dto.CardDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<CardDto> getAllCards() {
//        return cardRepository.findAll();
        List<Card> allCards = cardRepository.findAll();
        List<CardDto> cardDtos = new ArrayList<>();

        for (Card card : allCards) {
            CardDto cardDto = new CardDto();
            cardDto.setName(card.getName());
            cardDto.setRarity(card.getRarity());
            cardDto.setPrimaryType(card.getPrimaryType());
            cardDto.setSecondaryType(card.getSecondaryType());
            cardDto.setImageUrl(card.getImageUrl());
            cardDtos.add(cardDto);

        }
        return cardDtos;
    }

    public CardDto getCard(int id) {
        Card card = cardRepository.findAll().get(id);
        CardDto cardDto = new CardDto();
        cardDto.setName(card.getName());
        cardDto.setRarity(card.getRarity());
        cardDto.setPrimaryType(card.getPrimaryType());
        cardDto.setSecondaryType(card.getSecondaryType());
        cardDto.setImageUrl(card.getImageUrl());
        return cardDto;
    }

    public Card addCard(Card card) {
        return cardRepository.save(card);
    }


    public List<CardDto> multiAdd(List<Card> cards) {
        List<CardDto> cardDtos = new ArrayList<>();
        for (Card card : cards) {
            CardDto cardDto = new CardDto();
            cardDto.setName(card.getName());
            cardDto.setRarity(card.getRarity());
            cardDto.setPrimaryType(card.getPrimaryType());
            cardDto.setSecondaryType(card.getSecondaryType());
            cardDto.setImageUrl(card.getImageUrl());
            cardDtos.add(cardDto);
        }
        cardRepository.saveAll(cards);
        return cardDtos;
    }
}
