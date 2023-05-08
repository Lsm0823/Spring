package com.example.my.todo.dto;

import lombok.Data;

public class TodoDTO {
    @Data
    // getter , setter 갖고 있음
    
    // 전달하는 내용을 가공해서 전달
    public static class ReqHello{
        private Integer Idx;
        private String search;
    }
}
