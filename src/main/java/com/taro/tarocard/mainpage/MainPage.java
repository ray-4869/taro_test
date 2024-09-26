package com.taro.tarocard.mainpage;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/simpletaro")
public class MainPage {
    @GetMapping("/main")
    public String mainpage() {
        return "main_page";
    }
}
