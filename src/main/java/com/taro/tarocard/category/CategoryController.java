package com.taro.tarocard.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/categoris")
public class CategoryController {
    public final CategoryService categoryService;

    @GetMapping
    public List<Category> getCategoris () {
        return this.categoryService.getAllCategory();
    }
}
