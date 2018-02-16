package com.kakao.core;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class HomeService {
    public Mono<String> home() {
        return Mono.just("hello");
    }
}
