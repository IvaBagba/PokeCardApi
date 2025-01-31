package com.ivan.pokecard.dto;

import com.ivan.pokecard.Models.Rarity;
import com.ivan.pokecard.Models.Types;
import lombok.Data;

@Data
public class CardDto {
        private String name;
        private Types PrimaryType;
        private Types SecondaryType;
        private Rarity rarity;
        private String imageUrl;
}
