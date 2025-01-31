package com.ivan.pokecard.Repo;

import com.ivan.pokecard.Models.Card;
import com.ivan.pokecard.dto.CardDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {

}
