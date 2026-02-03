package com.jbnu.cjh.shop;

import jakarta.persistence.*;

@Entity
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동으로 1씩 증가하다록
    public Long id; //id컬럼에는 @Id붙여주자
    public String title;
    public java.time.LocalDate date;
}
