package com.example.my.todo.service;

import com.example.my.todo.entity.TodoEntity;
import com.example.my.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)

public class TodoService {
    // 커피 상품들을 준비
    private final TodoRepository todoRepository;

    public List<TodoEntity> findByDeleteYn(Character deleteYn){
        return todoRepository.findByDeleteYn(deleteYn);
    }


}
