package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Board {



    @Id // pk를 의미

    @GeneratedValue(strategy = GenerationType.IDENTITY) // 어떤 전략을 쓸것인지 선택 ?
    private Integer id;

    private String title;

    private String content;


}
