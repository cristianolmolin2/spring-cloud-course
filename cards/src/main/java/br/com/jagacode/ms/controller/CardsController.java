package br.com.jagacode.ms.controller;

import br.com.jagacode.ms.model.Card;
import br.com.jagacode.ms.model.Customer;
import br.com.jagacode.ms.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Card> getCardDetails(@RequestBody Customer customer){
        List<Card> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
        if(cards != null){
            return cards;
        }
        return null;
    }
}
