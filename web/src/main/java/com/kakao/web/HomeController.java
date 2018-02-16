package com.kakao.web;

import com.kakao.core.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {
    @Autowired
    HomeService homeService;

    @GetMapping("/")
    public Mono<String> home() {
        return homeService.home();
    }
}
