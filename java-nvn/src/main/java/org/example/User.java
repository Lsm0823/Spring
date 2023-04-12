package org.example;

import lombok.*;

@Data

// 모든 매개변수가 있는 생성자
@AllArgsConstructor
// 매개변수가 없는 생성자
@NoArgsConstructor
//
@Builder

public class User {
    private int idx;
    private String name;
    
}
