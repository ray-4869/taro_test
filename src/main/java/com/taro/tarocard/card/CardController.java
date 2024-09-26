package com.taro.tarocard.card;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/taro")
public class CardController {
    private final CardService cardService;

    @GetMapping
    public List<Card> getCard() {
        return this.cardService.getCard();
    }

    @GetMapping("/{id}")
    public Card getCardById (@PathVariable("id") Integer id) {
        return this.cardService.getCardById(id);
    }
}
