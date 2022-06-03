package Springtest2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 클라이언트가 요청
@RequestMapping("/home") // : 현재 클래스는 home매핑 된다
public class IndexController {

    @GetMapping("/main")
    public String home() {return "main";} // 타임리프 사용시 리턴값은 html명 // Response 요구가 없을경우 타임리프 html반환

    @GetMapping("/getdata")
    @ResponseBody // : Response(응답) Body(객체) : java 객체를 반환하겠다.
    public String getdate() {return "유재석";}  // : Response(응답) Body(객체) : java 객체를 반환하겠다.

   // @RequestMapping : 모든 url 매핑 가능

   // @GetMapping : get 메소드 url 매핑 [요청 변수 보인다 = 보안x 캐시o] [멱동성 사용]

   // @PostMapping : post 메소드 url 매핑 [요청 변수 x = 보안o 캐시x] [멱동성 사용 안함]

    ////////////////////////////////////////////////////////// 스프링에서 지원하는 요청방식 구분

   // @PutMapping : put 메소드 url 매핑 [삽입 , 수정 사용]

   // @DeleteMapping : delete메소드 url 매핑 [삭제시 사용]

   //  @PathVariable : 경로에 변수를 바인딩(넘겨주기) (get,post만드로도 충분히 매핑 가능)

    // post vs put/delete : 멱동성 : 요청후에 서버 상태를 남기기
    // 반복되는 많은 요청이 있을경우에 post 보다 put, delete 사용권장

}
