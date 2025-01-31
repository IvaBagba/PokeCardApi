package com.ivan.pokecard.Controllers;

import com.ivan.pokecard.Models.Card;
import com.ivan.pokecard.Services.CardService;
import com.ivan.pokecard.dto.CardDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")

public class cardController {

    private final CardService cardService;

    public cardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/allCards")
    public ResponseEntity<List<CardDto>> getAllCards() {
        return ResponseEntity.ok(cardService.getAllCards());
    }

    @GetMapping("/card")
    public ResponseEntity<CardDto> getCard(@RequestParam int id) {
        return ResponseEntity.ok(cardService.getCard(id));
    }

    @PostMapping("/addCard")
    public Card addCard(@RequestBody Card card) {
        return cardService.addCard(card);
    }

    @PostMapping("/mutliAdd")
    public ResponseEntity<List<CardDto>> addCard(@RequestBody List<Card> cards) {
        return ResponseEntity.ok(cardService.multiAdd(cards));
    }
}
