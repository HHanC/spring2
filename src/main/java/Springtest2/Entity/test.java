package Springtest2.Entity;

import javax.persistence.*;

@Entity // 해당 클래스를 엔티티[DB내 테이블과 매핑]로 사용
@Table(name = "test") // DB에서 사용될 테이블 이름 정하기
public class test { // 클래스

    @Id // 기본키 설정 pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동번호 auto
    public int no;              // 필드

    @Column(name = "content") // DB에서 사용할 필드
    public String content;      // 필드

}
// jpa
    // java <----------jpa(매핑)----------> DB
    // entity클래스                        table
    //  필드                                 필드
    //  예) 게시물 번호                       게시물번호
    //      게시물 내용                       게시물내용
