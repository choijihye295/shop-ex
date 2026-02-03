package com.jbnu.cjh.shop;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller //상품관련 API 여기다가 모으자
@RequiredArgsConstructor
public class ItemController {
    //리포지토리 인터페이스 등록
    private final ItemRepository itemRepository;

    //Loombok 없이 리포지토리 등록하려면
    /*@Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }*/


    @GetMapping("/list") //이 URL접속
    String list(Model model){
        //테이블에서 데이터 꺼내기 (JPA로 데이터 입출력)
        //리포지토리에서 DB입출력 함수 쓰기
        List<Item> result = itemRepository.findAll(); //list자료형으로 가져옴
        System.out.println(result.get(0).price);

        model.addAttribute("name", "이름");
        return "list.html"; //이거 보내주세요
        //템플릿 엔진 > html을 그때그때 만들어사 사용가능
    }
}
