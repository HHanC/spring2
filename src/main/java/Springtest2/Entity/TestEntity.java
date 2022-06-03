package Springtest2.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.*;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import java.util.Optional;

import static org.json.XMLTokener.entity;

@Entity // 해당 클래스를 엔티티[DB내 테이블과 매핑]로 사용
@Table(name = "test") // DB에서 사용될 테이블 이름 정하기
public class TestEntity { // 클래스

    @Id // 기본키 설정 pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동번호 auto
    public int no;              // 필드

    @Column(name = "content") // DB에서 사용할 필드
    public String content;      // 필드


// jpa : 클래스를 db테이블처럼 사용하자!
    // 1. java클래스를 엔티티 화 하면 DB테이블이 자동 생성된다!
    // java <----------jpa(매핑) JpaRepository : 조작 ----------> DB
    // entity클래스                        table
    //  필드                                 필드
    //  예) 게시물 번호                       게시물번호
    //      게시물 내용                       게시물내용
}