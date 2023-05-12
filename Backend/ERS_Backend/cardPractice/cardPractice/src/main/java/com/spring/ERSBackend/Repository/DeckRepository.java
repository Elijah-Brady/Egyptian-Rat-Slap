package com.spring.ERSBackend.Repository;

import com.spring.ERSBackend.Entities.standardDeck.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Integer> {}
