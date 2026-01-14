package com.jbnu.cjh.shop;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //상품관련 API 여기다가 모으자
public class ItemController {
    @GetMapping("/list") //이 URL접속
    String list(Model model){
        model.addAttribute("name", "이름");
        return "list.html"; //이거 보내주세요
        //템플릿 엔진 > html을 그때그때 만들어사 사용가능
    }
}
