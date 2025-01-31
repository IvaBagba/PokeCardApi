package com.ivan.pokecard.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
@Entity
public class Card {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Types PrimaryType;

    private Types SecondaryType;

    private Rarity rarity;

    private String imageUrl;


}
