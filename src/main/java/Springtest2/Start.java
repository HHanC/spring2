package Springtest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        SpringApplication.run(Start.class);
    }

}

/*
* 패키지 구조
*   1. srt
*       2. main
*           3. java : 백엔드
*               4. root패키지 [임의 : 홈페이지명]
*                   5. controller 패키지
*                   5. dto 패키지
*                   5. dao(entity)패키지
*                   5. service 패키지
*                   5. Start클래스 [임의]
*           3. resources : 프론트엔드, 설정파일
*               4. static : css.js.img 등등등
*               4. templates : html  등등
* */

// api
// 스프링 : java를 이용한 미리 만들어진 다양한 api들
    // 스프링부트 : 스프링내 자주 사용되는 api들의 기본 셋팅
        // @SpringBootApplication
        // 1. mvc컴포너트 기본값 세팅
        // 2. tomcat 내장 서버 지원 세팅
        // 3. restful api : http(url) 이용한 자원공유
    // 1. SpringApplication.run(현재클래스명.class); : 스프링 시작

// 2. 타임리프 : 템플릿 엔진(정적문서 데이터를 넣어주는 프로그램)
    // 템플릿 엔진 :
        // 백엔드 : 1. jsp(스프링권장x -> 확장자 war) 2.타임리프 3. 머스테치(스프링 공식)
        // 프론트엔드 : recat.js , vue.js
    // 백엔드(java/spring) : 1. DB처리 2. restful api 제작
    // 프론트엔드(js)    :    1. restful api url을 이용한 데이터 교환

    // 1. view <-----템플릿엔진-----> controller
        // * 스프링
        // 1. 클라이언트가 url요청했을 경우 @Controller 내 에서 url 찾기

// 3. jdbc
    // 1.dao : 순수 자바형식의 sql 작성
    // 2. sql mapper [xml방식] : mydatis(dbms)
    // 3. jpa : jdbc(java--db) api
        // jpa 사용목적은 sql 작성 코드를 줄이기!

    // 1. Spring Data JPA
    // 2. MySQL Driver





