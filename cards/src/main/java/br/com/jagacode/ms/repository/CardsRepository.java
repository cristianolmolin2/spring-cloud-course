package br.com.jagacode.ms.repository;

import br.com.jagacode.ms.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepository extends JpaRepository<Card, Long> {

    List<Card> findByCustomerId(int customerId);
}
