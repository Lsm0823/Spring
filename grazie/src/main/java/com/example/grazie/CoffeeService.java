package com.example.grazie;

import org.springframework.stereotype.Service;

@Service
// 커피 말아주는 직원 -> 아메리카노, 카푸치노, 아샷추만 만들수 있음
public class CoffeeService {
    public Coffee 아메리카노(){
        return new Coffee("아메리카노");
    }
    public Coffee 카푸치노(){
        return new Coffee("카푸치노");
    }
    public Coffee 아샷추(){
        return new Coffee("아샷추");
    }
}
