package com.example.grazie;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
// 커피이름을 받는 생성자 생성  = @AllArgsConstructor
@AllArgsConstructor
public class Coffee {
    private String name;
}
