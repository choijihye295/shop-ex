package com.jbnu.cjh.shop;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller //상품관련 API 여기다가 모으자
@RequiredArgsConstructor
public class ItemController {
    //리포지토리 인터페이스 등록
    private final ItemRepository itemRepository;

    @GetMapping("/list") //이 URL접속
    String list(Model model){
        //테이블에서 데이터 꺼내기 (JPA로 데이터 입출력)
        //리포지토리에서 DB입출력 함수 쓰기
        List<Item> result = itemRepository.findAll(); //list자료형으로 가져옴

        model.addAttribute("items", result);
        return "list.html"; //이거 보내주세요
        //템플릿 엔진 > html을 그때그때 만들어사 사용가능
    }

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @PostMapping("/add")
    public String addPost(String title, Integer price) {
        Item item = new Item();
        item.setTitle(title);
        item.setPrice(price);

        itemRepository.save(item);
        return "redirect:/list";
    }
}
