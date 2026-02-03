package com.jbnu.cjh.shop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> { //여기에 DB입출력 함수 많이 들어있음
    //리포지토리 인터페이스 민들고 <테이블명,id타입>


}
