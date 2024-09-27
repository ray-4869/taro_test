package com.taro.tarocard.tarot;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/main")
public class Tarot {
    @GetMapping
    public String mainpage() {
        return "main_page";
    }

    @GetMapping("/view")
    public String viewTarot () {
        return "view_page";
    }

    @GetMapping("/history")
    public String historyTarot() {
        return "history_page";
    }

    @GetMapping("/feedback")
    public String feedbackTarot() {
        return "feedback_page";
    }
}
