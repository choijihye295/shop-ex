package com.jbnu.cjh.shop;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class Item { //Entity -> Item이름으로 테이블 생성해줌
    //테이블에 어떤 컬럼 들어갈지 정의해야함
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //자동으로 1씩 증가하다록
    public Long id; //id컬럼에는 @Id붙여주자

    //@Column(nullable = false) //이 컬럼에 제한을 주기

    public String title;
    public Integer price;


}

//컬럼설정 변경사항은 DB에 반영이 자동으로 안될수도 있어서 삭제하고 다시 만들어야함.
//처음에 잘 만드는게 중요함
