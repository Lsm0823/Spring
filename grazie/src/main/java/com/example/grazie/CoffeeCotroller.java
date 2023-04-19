package com.example.grazie;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//카운터직원
@RestController
@RequiredArgsConstructor
public class CoffeeCotroller {
    private final CoffeeService coffeeService;

//    @RequiredArgsConstructor 와 밑의 생성자 만드는것과 동일
//    public CoffeeCotroller(CoffeeService coffeeService) {
//        this.coffeeService = coffeeService;
//    }

    //     @GetMapping("/아메리카노") = 고객이 요청하는 내용
    @GetMapping("/아메리카노")
    public Coffee 아메리카노(){
        return coffeeService.아메리카노();
    }
    @GetMapping("/카푸치노")
    public Coffee 카푸치노(){
        return coffeeService.카푸치노();
    }
    @GetMapping("/아샷추")
    public Coffee 아샷추(){
        return coffeeService.아샷추();
    }
}
