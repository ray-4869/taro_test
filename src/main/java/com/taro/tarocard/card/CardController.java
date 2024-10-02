package com.taro.tarocard.card;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/taro")
public class CardController {
    private final CardService cardService;

    @GetMapping("/love/{id}")
    public Card getCardById (@PathVariable("id") Integer id, Model model) {
        return this.cardService.getCardById(id);
    }


}
