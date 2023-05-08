package com.example.my.todo.controller;

import com.example.my.todo.dto.TodoDTO;
import com.example.my.todo.entity.TodoEntity;
import com.example.my.todo.repository.TodoRepository;
import com.example.my.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TodoController {
    // 의존성 때문에 todoService를 주입
    private final TodoService todoService;

    // 기본 루트 주소 연결
//    @GetMapping("/{idx}")
//    // 리턴값에 붙혀도 같은 작동, ResponseBody를 붙히면 파일이 아니라 진짜 문자열이 반환
//    @ResponseBody
//    public TodoEntity hello(@PathVariable Integer idx) {
//        return todoService.findByIdx(idx);
//    }

//    @GetMapping("/")
//    @ResponseBody
//    public TodoEntity hello(Map<String , Object> map) {
//        System.out.println(map);
//        return null;
//    }

//    @GetMapping("/")
//    @ResponseBody
//    public TodoEntity hello(TodoDTO.ReqHello reqDTO) {
//        System.out.println(reqDTO);
//        return todoService.findByIdx(reqDTO.getIdx());
//    }

//    @GetMapping("/{idx}/{search}")
//    @ResponseBody
//    public TodoEntity hello(
//            // 게시판에서 상세로 넘어갈 때 자주 사용
//            @PathVariable Integer idx,
//            // 검색 할 때 주로 사용
//            @PathVariable String search
//    ) {
//        System.out.println(idx);
//        System.out.println(search);
//        return null;
//    }

//    @GetMapping("/")
//    @ResponseBody
//    public TodoEntity hello(@RequestBody TodoDTO.ReqHello reqDto){
//        System.out.println(reqDto);
//        return null;
//    }


    @GetMapping("/todoList")
    public String todoList(Model model) {
        List<TodoEntity> todoList = todoService.findByDeleteYn('N');
       long todoCount = todoList.stream().filter((todoEntity) -> todoEntity.getDoneYn().equals('N')).count();

       model.addAttribute("todoList", todoList);
       model.addAttribute("todoCount", todoCount);

        //  model.addAttribute("todoList", todoService.findByDeleteYn('N'));
        return "todoList";
    }


}
