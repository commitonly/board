package com.study.board.repository;


import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}


// Marking : 토이프로젝트 기간 2주 처리중으로 잠정보류 <- 해당 프로젝트 종료 후 실습 부족 시 해당 레포 재실행 예정. fin