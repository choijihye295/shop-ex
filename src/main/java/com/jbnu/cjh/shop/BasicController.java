package com.jbnu.cjh.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

//메인 페이지 접속시 '안녕하세요' 보내주고 싶다.
//컨트롤러 붙이면 웹서버 기능 가능. 및 스프링이 알아서 챙겨줌.
@Controller
public class BasicController {
    @GetMapping("/") //메인 페이지 접속
    //@ResponseBody //문자 그대로 보내주세요, 이거 빼야 html 파일 보내줌
    String hello(){
        return "index.html"; //이거 보내주세요
    }

    @GetMapping("/about") //이 URL접속
    @ResponseBody
    String about(){
        return "피싱사이트일수도...?"; //이거 보내주세요
    }



}
