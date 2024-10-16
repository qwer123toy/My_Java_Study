package kr.co.greenart.plain;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// PlainTextController 클래스는 일반 텍스트를 응답으로 전송하는 컨트롤러입니다.
@Controller
// @ResponseBody 어노테이션은 뷰 이름이 아닌 메서드의 반환 값을 HTTP 응답의 바디에 직접 쓰도록 합니다.
@ResponseBody
public class PlainTextController {

    // @GetMapping 어노테이션은 "/plain" 경로로 GET 요청이 들어올 때 이 메서드를 호출하도록 합니다.
    // produces 속성을 사용하여 응답의 Content-Type을 "text/plain"으로 지정합니다.
    @GetMapping(value = "/plain", produces = "text/plain; charset=utf-8")
    

    public String plain() {
        // 클라이언트에게 일반 텍스트를 반환합니다.
        return "뷰이름이 아니라 일반 텍스트를 응답 바디에 전송하고 싶어요!";
    }
    @GetMapping(value = "/json", produces = "application/json; charset=utf-8")
    public  String json() {
    	return "{\"prop\":1234}";
    }
}
